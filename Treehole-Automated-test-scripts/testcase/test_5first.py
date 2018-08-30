import unittest
import Openwebsite

class first(unittest.TestCase):
    def setUp(self):
        self.driver=Openwebsite.start().start()
    def tearDown(self):
        self.driver.quit()
    def test_hot(self):
        driver=self.driver
        driver.find_element_by_xpath('/html/body/header/section[1]/nav/ul/li[1]/a').click()
        text=driver.find_element_by_xpath('/html/body/main/section[1]/div[1]/ul/li[1]/div/p').text
        self.assertEqual('最热帖',text)
    def test_goodpost(self):
        driver=self.driver
        driver.find_element_by_xpath('/html/body/header/section[1]/nav/ul/li[2]/a').click()
        text=driver.find_element_by_xpath('/html/body/main/section[1]/div[1]/ul/li[1]/div/p').text
        self.assertEqual('最热帖',text)
    def test_new(self):
        driver=self.driver
        driver.find_element_by_xpath('/html/body/header/section[1]/nav/ul/li[3]/a').click()
        text=driver.find_element_by_xpath('/html/body/main/section[1]/div[1]/ul/li[1]/div/p').text
        self.assertEqual('自动测试帖0',text)