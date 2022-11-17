/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pe.edu.upn.deliveryselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author INTEL
 */
public class DeliverySelenium {

    public static void main(String[] args) throws InterruptedException {
        /*-----Genera una instancia del navegador chrome driver----*/
        System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        /*-----Se asigna una direccion para navegar----*/
        String url="http://localhost:8080";
        driver.get(url);
        
        Thread.sleep(3000);
        
        /*-----Selecciona la opcion iniciar sesion----*/
        WebElement idSesion = driver.findElement(By.id("idSesion"));
        idSesion.click();
        
        Thread.sleep(3000);
        
        /*-----Selecciona los elementos para poder intereactuar posteriormente----*/
        WebElement idUsername = driver.findElement(By.id("idUsername"));
        WebElement idPassword = driver.findElement(By.id("idPassword"));
        
        Thread.sleep(3000);
        
        WebElement idLogin = driver.findElement(By.id("idLogin"));
        
        /*-----Envia las credenciales a los elementos web----*/
        idUsername.sendKeys("Muchari22");
        idPassword.sendKeys("contra02");
        
        idLogin.click();
        
        Thread.sleep(3000);
        
        /*-----Selecciona la opcion "Nuestra Carta"----*/
        WebElement idCarta = driver.findElement(By.id("idCarta"));
        idCarta.click();
        
        Thread.sleep(3000);
        
        /*-----Selecciona diversos productos para generar un pedido----*/
        WebElement idCeviche = driver.findElement(By.className("Ceviche"));
        idCeviche.click();
        
        Thread.sleep(3000);
        
        WebElement idSeguirCompraOn = driver.findElement(By.id("idSeguirCompraOn"));
        idSeguirCompraOn.click();
        
        Thread.sleep(3000);
        
        WebElement idParihuela = driver.findElement(By.className("Parihuela"));
        idParihuela.click();
        
        Thread.sleep(3000);
        
        idSeguirCompraOn = driver.findElement(By.id("idSeguirCompraOn"));
        idSeguirCompraOn.click();
        
        Thread.sleep(3000);
        
        WebElement idRefrescos= driver.findElement(By.id("Refrescos"));
        idRefrescos.click();
        
        Thread.sleep(3000);
        
        WebElement idInka = driver.findElement(By.className("Inka"));
        idInka.click();
        
        Thread.sleep(3000);
        
        /*-----Se escoge las cantidades deseadas----*/
        //Mas = boton '+' | N° = id
        WebElement cantIdCeviche = driver.findElement(By.id("Mas1"));
        cantIdCeviche.click();
        
        Thread.sleep(3000);
        
        WebElement cantIdParihuela = driver.findElement(By.id("Mas3"));
        cantIdParihuela.click();
        
        Thread.sleep(3000);
        
        WebElement cantIdInka = driver.findElement(By.id("Mas10"));
        cantIdInka.click();
        
        Thread.sleep(3000);
        
        /*-----Confirmacion de compra----*/  
        WebElement idPagarAhoraOn = driver.findElement(By.id("idPagarAhoraOn"));
        idPagarAhoraOn.click();
        
        Thread.sleep(3000);
        
        Select idDistrito = new Select(driver.findElement(By.id("idDistrito")));
        WebElement idDireccion = driver.findElement(By.id("idDireccion"));
        Select idTipoPago = new Select(driver.findElement(By.id("idTipoPago")));
        WebElement idConfirmarCompra = driver.findElement(By.id("idConfirmarCompra"));
        
        idDireccion.clear();
        
        Thread.sleep(3000);
        
        idDistrito.selectByVisibleText("San Martin");//Selecciona una determinada opcion del combo box
        idDireccion.sendKeys("Manzana C4 Lote #40");
        idTipoPago.selectByVisibleText("Tarjeta");
        
        Thread.sleep(3000);
        
        idConfirmarCompra.click();
    }
}
