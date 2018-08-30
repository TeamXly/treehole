import unittest
import Openwebsite


class login(unittest.TestCase):
    def setUp(self):
        self.driver=Openwebsite.start().start()
    def tearDown(self):
        self.driver.quit()
    def test_login_true(self):
        driver=self.driver
        driver.find_element_by_css_selector('body > header > section.header-top > a > span').click()
        driver.find_element_by_css_selector('#reg-form > label:nth-child(1) > div > input[type="text"]').send_keys('18212345678')
        driver.find_element_by_css_selector('#reg-form > label:nth-child(2) > div > input[type="password"]').send_keys('123456789')
        driver.find_element_by_xpath('//*[@id="reg-form"]/label[3]/div/button').click()
        text=driver.find_element_by_css_selector('body > header > section.header-top > span.welcome > a').text
        self.assertEqual(text,'123')
    def test_login_wrong_phone(self):
        driver=self.driver
        driver.find_element_by_css_selector('body > header > section.header-top > a > span').click()
        driver.find_element_by_css_selector('#reg-form > label:nth-child(1) > div > input[type="text"]').send_keys('18212345671')
        driver.find_element_by_css_selector('#reg-form > label:nth-child(2) > div > input[type="password"]').send_keys('123456789')
        driver.find_element_by_xpath('//*[@id="reg-form"]/label[3]/div/button').click()
        text=driver.switch_to_alert().text
        self.assertEqual(text,"登录失败，请检查用户名与密码是否正确")
        driver.switch_to_alert().accept()
    def test_login_wrong_password(self):
        driver=self.driver
        driver.find_element_by_css_selector('body > header > section.header-top > a > span').click()
        driver.find_element_by_css_selector('#reg-form > label:nth-child(1) > div > input[type="text"]').send_keys('18212345678')
        driver.find_element_by_css_selector('#reg-form > label:nth-child(2) > div > input[type="password"]').send_keys('123456780')
        driver.find_element_by_xpath('//*[@id="reg-form"]/label[3]/div/button').click()
        text=driver.switch_to_alert().text
        self.assertEqual(text,"登录失败，请检查用户名与密码是否正确")
        driver.switch_to_alert().accept()
