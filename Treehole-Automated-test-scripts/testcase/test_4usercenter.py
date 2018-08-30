import time
import unittest

import Openwebsite

class usercenter(unittest.TestCase):
    def setUp(self):
        self.driver=Openwebsite.start().login()
    def tearDown(self):
        self.driver.quit()
    def test_user_check(self):
        driver=self.driver
        driver.find_element_by_xpath('/html/body/header/section[1]/nav/ul/li[6]/a').click()
        text=driver.find_element_by_xpath('/html/body/div[2]/div[1]/h3').text
        self.assertEqual('自动测试帖1',text)
    def test_user_delete(self):
        driver=self.driver
        driver.find_element_by_xpath('/html/body/header/section[1]/nav/ul/li[6]/a').click()
        driver.find_element_by_xpath('/html/body/div[2]/div[1]/button').click()
        time.sleep(1)
        driver.refresh()
        text=driver.find_element_by_xpath('/html/body/div[2]/div[1]/h3').text
        self.assertNotEqual('自动测试帖1',text)
    def test_user_lookDetail(self):
        driver=self.driver
        driver.find_element_by_xpath('/html/body/header/section[1]/nav/ul/li[6]/a').click()
        # driver.find_element_by_xpath('/html/body/div[2]/div[1]/button').click()
        time.sleep(1)
        driver.find_element_by_xpath('/html/body/div[2]/div[1]/form/div/input').click()
        text=driver.find_element_by_id('content').text
        text.strip()
        text.replace('\n', '')
        self.assertEqual('自动测试帖0',text)