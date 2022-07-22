package com.fundamentosplatzi.springboot.fundamentos;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyBean;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentosplatzi.springboot.fundamentos.component.ComponentDependency;
import com.fundamentosplatzi.springboot.fundamentos.personalize.Wheel;
import com.fundamentosplatzi.springboot.fundamentos.pojo.UserPojo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//Implementación de la interfaz CommandLineRunner
public class FundamentosApplication implements CommandLineRunner {
	//Creacion de un error personalizado con Apache commons
	Log LOGGER = LogFactory.getLog(FundamentosApplication.class);

	//Inyección de dependencias dentro de la aplicación DEPENDENCIA INYECTADA
	//@Autowired-> este era obligatorio antes para especificar la inyección de la dependencia
	private ComponentDependency componentDependency;
	//Inyección de dependencia personalizada de mi Bean
	private MyBean myBean;
	//Algo mas complejo
	private MyBeanWithDependency myBeanWithDependency;
	//Personlize
	private Wheel wheel;
	//Agregar dependencia de bean usando properties
	private MyBeanWithProperties myBeanWithProperties;
	//Agregar POJO como dependencia
	private UserPojo userPojo;

	//Cuando una Dependencia está siendo implementada por dos clases o más es necesario especificar cuál de ellas se usara con ayuda del @Qualifiler o especificando @Primary en el Bean principal

	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean, MyBeanWithDependency myBeanWithDependency, Wheel wheel, MyBeanWithProperties myBeanWithProperties, UserPojo userPojo){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
		this.wheel = wheel;
		this.myBeanWithProperties = myBeanWithProperties;
		this.userPojo = userPojo;
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
		System.out.println(myBeanWithProperties.function());
		System.out.println(userPojo.getAge());
		//puede usarse dentro de las sentencias try catch
		try {
			int value = 10/0;
			LOGGER.debug("El valor del proceso es: " + value );
		}catch (Exception e){
			LOGGER.error(" Error en proceso anterior " + e.getMessage() + "||" + e.getStackTrace() );
		}

		LOGGER.error("Esto es un error de la aplicacion para mostrar cuando se me de la buena voluntad");
	}
}
