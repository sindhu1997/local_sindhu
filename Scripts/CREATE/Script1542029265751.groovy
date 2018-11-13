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

WebUI.setText(findTestObject('Object Repository/CREATE_OR/Page_JIN Login/input_JIN_email'), 'maddie@gmail.com')

WebUI.click(findTestObject('Object Repository/CREATE_OR/Page_JIN Login/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/CREATE_OR/Page_JIN Login/input_Email_password'), 'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.click(findTestObject('Object Repository/CREATE_OR/Page_JIN Login/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/CREATE_OR/Page_Dashboard/i_menu'))

WebUI.click(findTestObject('Object Repository/CREATE_OR/Page_Dashboard/a_people Users'))

WebUI.click(findTestObject('Object Repository/CREATE_OR/Page_Users/i_add'))

WebUI.setText(findTestObject('Object Repository/CREATE_OR/Page_Users/input_close_first_name'), 'lopi')

WebUI.click(findTestObject('Object Repository/CREATE_OR/Page_Users/label_Last Name'))

WebUI.setText(findTestObject('Object Repository/CREATE_OR/Page_Users/input__last_name'), 'juk')

WebUI.click(findTestObject('Object Repository/CREATE_OR/Page_Users/label_Email Id'))

WebUI.setText(findTestObject('Object Repository/CREATE_OR/Page_Users/input__email'), 'drth@gmail.com')

WebUI.setText(findTestObject('Object Repository/CREATE_OR/Page_Users/input__mobileNumber'), '123654')

WebUI.click(findTestObject('Object Repository/CREATE_OR/Page_Users/label_Date of Joining'))

WebUI.setText(findTestObject('Object Repository/CREATE_OR/Page_Users/input__doj'), '2018-11-01')

WebUI.click(findTestObject('Object Repository/CREATE_OR/Page_Users/label_Female'))

WebUI.click(findTestObject('Object Repository/CREATE_OR/Page_Users/label_Unmarried'))

WebUI.click(findTestObject('Object Repository/CREATE_OR/Page_Users/label_No'))

WebUI.click(findTestObject('Object Repository/CREATE_OR/Page_Users/span_select'))

WebUI.click(findTestObject('Object Repository/CREATE_OR/Page_Users/a_BrandonEdwards'))

WebUI.click(findTestObject('Object Repository/CREATE_OR/Page_Users/span_select_caret'))

WebUI.click(findTestObject('Object Repository/CREATE_OR/Page_Users/a_In Probation 3'))

WebUI.setText(findTestObject('Object Repository/CREATE_OR/Page_Users/input_NO SEARCH RESULT_ng-vali'), '569')

WebUI.click(findTestObject('Object Repository/CREATE_OR/Page_Users/span_select_caret_1'))

WebUI.click(findTestObject('Object Repository/CREATE_OR/Page_Users/a_Mobile Solution Consultant'))

WebUI.click(findTestObject('Object Repository/CREATE_OR/Page_Users/button_select'))

WebUI.click(findTestObject('Object Repository/CREATE_OR/Page_Users/a_Create'))

