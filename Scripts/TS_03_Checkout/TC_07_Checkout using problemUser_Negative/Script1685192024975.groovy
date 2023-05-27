import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Login_Swag Labs/input_Swag Labs_user-name'), username)

WebUI.setEncryptedText(findTestObject('Login_Swag Labs/input_Swag Labs_password'), password)

WebUI.click(findTestObject('Login_Swag Labs/input_Swag Labs_login-button'))

WebUI.click(findTestObject('Object Repository/Main_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Main_Swag Labs/button_Add to cart_1'))

WebUI.click(findTestObject('Object Repository/Main_Swag Labs/button_Add to cart_1_2'))

WebUI.click(findTestObject('Main_Swag Labs/button_Add to cart_1_2_3'))

WebUI.click(findTestObject('Main_Swag Labs/button_Add to cart_1_2_3_4'))

WebUI.click(findTestObject('Main_Swag Labs/button_Add to cart_1_2_3_4_5'))

WebUI.click(findTestObject('Main_Swag Labs/icon_shoppingCart'))

WebUI.click(findTestObject('Object Repository/Main_Swag Labs/button_Checkout'))

WebUI.setText(findTestObject('Checkout_Swag Labs/input_Checkout Your Information_firstName'), firstName)

WebUI.setText(findTestObject('Checkout_Swag Labs/input_Checkout Your Information_lastName'), lastName)

WebUI.setText(findTestObject('Checkout_Swag Labs/input_Checkout Your Information_postalCode'), postalCode)

WebUI.click(findTestObject('Checkout_Swag Labs/input_Cancel_continue'))

WebUI.verifyElementText(findTestObject('Checkout_Swag Labs/h3_Error Last Name is required'), 'Error: Last Name is required')

