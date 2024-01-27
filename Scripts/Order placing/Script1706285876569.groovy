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

WebUI.navigateToUrl('https://demo.nopcommerce.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store/img'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. HTC One M8 And_be41b8/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. HTC One M8 And_be41b8/a_Digital downloads'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Digital downloads/img'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Night Visions/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Night Visions/span_Shopping cart'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Shopping Cart/input_termsofservice'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Shopping Cart/button_Checkout'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Login/button_Checkout as Guest'))

//WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/div_First name   Last name   Email   Compan_f9b044'))

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_BillingNewAddress.FirstName'), 
    'name')

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_BillingNewAddress.LastName'), 
    'name')

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_BillingNewAddress.Email'), 'name@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_BillingNewAddress.Company'), 
    'one company')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/select_Select countryUnited StatesAfghanist_6b3112'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/select_Select countryUnited StatesAfghanist_6b3112'), 
    '210', true)

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_BillingNewAddress.City'), 'city1')

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_BillingNewAddress.Address1'), 
    'address 1')

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_BillingNewAddress.ZipPostalCode'), 
    '123456')

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_BillingNewAddress.PhoneNumber'), 
    '7788556633')

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/button_Continue_1'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/button_Continue_12'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/button_Continue_123'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/button_Confirm'))

WebUI.closeBrowser()

