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

Mobile.startApplication(GlobalVariable.APK, true)

CustomKeywords.'customKeywords.MyApp.isElementPresent_inMoble'(findTestObject('OR API Demos/android.widget.Button - OK'))

Mobile.tap(findTestObject('Object Repository/OR API Demos/android.widget.TextView - API Demos (2)'), 0)

Mobile.tap(findTestObject('Object Repository/OR API Demos/android.widget.TextView - Security'), 0)

Mobile.tap(findTestObject('Object Repository/OR API Demos/android.widget.TextView - KeyStore'), 0)

Mobile.setText(findTestObject('Object Repository/OR API Demos/android.widget.EditText'), Plaintext, 0)

Mobile.setText(findTestObject('Object Repository/OR API Demos/android.widget.EditText (1)'), Ciphertext, 0)

Mobile.setText(findTestObject('Object Repository/OR API Demos/android.widget.EditText (2)'), Alias, 0)

Mobile.scrollToText('GENERATE')

Mobile.tap(findTestObject('Object Repository/OR API Demos/android.widget.RelativeLayout'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()
