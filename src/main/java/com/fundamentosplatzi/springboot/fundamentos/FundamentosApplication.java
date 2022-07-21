package com.fundamentosplatzi.springboot.fundamentos;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyBean;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentosplatzi.springboot.fundamentos.component.ComponentDependency;
import com.fundamentosplatzi.springboot.fundamentos.personalize.Wheel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//Implementación de la interfaz CommandLineRunner
public class FundamentosApplication implements CommandLineRunner {
	//Inyección de dependencias dentro de la aplicación DEPENDENCIA INYECTADA
	//@Autowired-> este era obligatorio antes para especificar la inyección de la dependencia
	private ComponentDependency componentDependency;
	//Inyección de dependencia personalizada de mi Bean
	private MyBean myBean;
	//Algo mas complejo
	private MyBeanWithDependency myBeanWithDependency;
	//Personlize
	private Wheel wheel;

	//Cuando una Dependencia está siendo implementada por dos clases o más es necesario especificar cuál de ellas se usara con ayuda del @Qualifiler o especificando @Primary en el Bean principal

	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean, MyBeanWithDependency myBeanWithDependency, Wheel wheel){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
		this.wheel = wheel;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}
	//El método run permite a grandes rasgos ejecutar en la aplicación todo lo que necesitemos, en este caso mostraremos nuestra implementación de la dependencia ComponentDependency
	//DEPENDENCIA UTILIZADA COMO IMPLEMENTACIÓN DE OTRO OBJETO
	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		// Utilización de la implementación de la interfaz en la clase
		myBean.print();
		myBeanWithDependency.printWithDependency();
		wheel.rodar();
	}
}
