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

WebUI.navigateToUrl('https://my-vue-todos.netlify.app/')

WebUI.click(findTestObject('Object Repository/TC_TDL_005/Page_vue-todos/button_Finish doing laundry_btn btn-outline_c7c9c9'))

WebUI.click(findTestObject('Object Repository/TC_TDL_005/Page_vue-todos/li_Take out the trash_d-flex align-items-ce_99ec02'))

WebUI.setText(findTestObject('Object Repository/TC_TDL_005/Page_vue-todos/input_Take out the trash_form-control'), 'Take A Bath')

WebUI.sendKeys(findTestObject('Object Repository/TC_TDL_005/Page_vue-todos/input_Take out the trash_form-control'), Keys.chord(
        Keys.ENTER))

WebUI.closeBrowser()

