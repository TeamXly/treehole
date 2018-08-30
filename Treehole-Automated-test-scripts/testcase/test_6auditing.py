import time
import unittest
import Openwebsite

class auditing(unittest.TestCase):
    def setUp(self):
        self.driver=Openwebsite.start().login()
    def tearDown(self):
        self.driver.quit()
    def test_1_check(self):
        driver=self.driver
        driver.find_element_by_xpath('/html/body/header/section[1]/nav/ul/li[4]/a').click()
        text=driver.find_element_by_xpath('/html/body/div[2]/div[1]/h3').text
        self.assertEqual('自动测试帖0',text)
    def test_2_detail(self):
        driver=self.driver
        driver.find_element_by_xpath('/html/body/header/section[1]/nav/ul/li[4]/a').click()
        driver.find_element_by_xpath('/html/body/div[2]/div[1]/form/div/input').click()
        text=driver.find_element_by_xpath('//*[@id="content"]').text
        text.strip()
        text.replace('\n','')
        self.assertEqual('自动测试帖0',text)
    def test_3_addgood(self):
        driver=self.driver
        driver.find_element_by_xpath('/html/body/header/section[1]/nav/ul/li[4]/a').click()
        driver.find_element_by_xpath('/html/body/div[2]/div[1]/form/div/input').click()
        driver.find_element_by_xpath('/html/body/div[2]/div/div[2]/button[2]').click()
        time.sleep(1)
        driver.switch_to_alert().accept()
        driver.get('http://10.25.209.43:8080')
        driver.find_element_by_xpath('/html/body/header/section[1]/nav/ul/li[2]/a').click()
        text=driver.find_element_by_xpath('/html/body/main/section[1]/div[1]/ul/li[1]/div/p').text
        self.assertEqual('自动测试帖0',text)
    def test_4_delete(self):
        driver=self.driver
        driver.find_element_by_xpath('/html/body/header/section[1]/nav/ul/li[4]/a').click()
        driver.find_element_by_xpath('/html/body/div[2]/div[1]/form/div/input').click()
        driver.find_element_by_xpath('/html/body/div[2]/div/div[2]/button[1]').click()
        time.sleep(1)
        driver.switch_to_alert().accept()
        driver.get('http://10.25.209.43:8080')
        driver.find_element_by_xpath('/html/body/header/section[1]/nav/ul/li[2]/a').click()
        text=driver.find_element_by_xpath('/html/body/main/section[1]/div[1]/ul/li[1]/div/p').text
        self.assertNotEqual('自动测试帖0',text)