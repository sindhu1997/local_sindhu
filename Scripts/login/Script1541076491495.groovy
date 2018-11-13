import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.0.28:5051/')

WebUI.setText(findTestObject('Object Repository/user_login_or/Page_JIN Login/input_JIN_email'), 'maddie@gmail.com')

WebUI.click(findTestObject('Object Repository/user_login_or/Page_JIN Login/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/user_login_or/Page_JIN Login/input_Email_password'), 'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.click(findTestObject('Object Repository/user_login_or/Page_JIN Login/button_LOG IN'))

WebUI.click(findTestObject('Object Repository/user_login_or/Page_Dashboard/i_menu'))

WebUI.click(findTestObject('Object Repository/user_login_or/Page_Dashboard/div_people Users'))

