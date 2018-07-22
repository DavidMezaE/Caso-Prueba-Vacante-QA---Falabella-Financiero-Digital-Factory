package pasosDefinidos;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginPasosDefinidos {
	
static WebDriver driver;	
	
@Given("^Se ingresa a navegador y vamos al buscador de google$")
	public void Se_ingresa_a_navegador_y_vamos_al_buscador_de_google(){			
	System.setProperty("webdriver.chrome.driver", "/Users/Equipo/eclipse-workspace/casoPrueba.falabella/Driver/chromedriver");	
	driver = new ChromeDriver();
	driver.get("https://www.google.com");
	}


@When("^Se confirma el titulo del buscador$")
public void se_confirma_el_titulo_del_buscador(){
	String titulo = driver.getTitle();
	System.out.println(titulo);
	Assert.assertEquals("Google", titulo);
	
}

@Then("^el usuario ingresa la palabra a buscar$")
public void el_usuario_ingresa_la_palabra_a_buscar() throws InterruptedException {
	driver.findElement(By.name("q")).sendKeys("Linkedin");
	Thread.sleep(2000);
}

@Then("^el usuario presiona el boton buscar$")
public void el_usuario_presiona_el_boton_buscar()  {
    driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
}


@Then("^Se presiona link de inicio de sesion linkedin$")
public void se_presiona_link_de_inicio_de_sesion_linkedin() throws InterruptedException{
   driver.findElement(By.linkText("LinkedIn: inicio de sesión o registro")).click();
   Thread.sleep(3000);
}

public static void main(String[] args){

	WebElement element = driver.findElement(By.id("login-email"));

element.sendKeys("");
}
//Segundo Scenario 

@Given("^Usuario ingresa su username \"([^\"]*)\" y su contraseña \"([^\"]*)\"$")
public void usuario_ingresa_su_username_y_su_contraseña(String usuario, String clave) throws Throwable {
   driver.findElement(By.id("login-email")).sendKeys(usuario);
   driver.findElement(By.id("login-password")).sendKeys(clave);
}

@When("^usuario presiona boton de login$")
public void usuario_presiona_boton_de_login()  {
	driver.findElement(By.id("login-submit")).click();
	
}

@When("^Busca contacto de red$")
public void busca_contacto_de_red() throws InterruptedException  {
	driver.findElement(By.id("mynetwork-tab-icon")).click();
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Ver todo")).click();
	// driver.findElement(By.xpath("//*[@id=\"ember981\"]/input")).sendKeys("David Meza");
	 Thread.sleep(2000);
}

@When("^Visualiza perfil de contacto$")
public void visualiza_perfil_de_contacto() throws Throwable {
	driver.findElement(By.linkText("David Meza")).click();
	Thread.sleep(2000);
}

/*
public  void scrollDown() {	

	 JavaScriptExecutor js = (JavaScriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,500)");

}
*/
// Scenario 3 

@Given("^Se ingresa a la seccion experiencia laboral$")
public void se_ingresa_a_la_seccion_experiencia_laboral() throws Throwable {
	driver.findElement(By.id("feed-tab-icon")).click();
	 Thread.sleep(2000);
}

@When("^se selecciona perfil$")
public void se_selecciona_perfil() throws Throwable {
	driver.findElement(By.linkText("Adolfo Meza")).click();
	 Thread.sleep(2000);
}


}