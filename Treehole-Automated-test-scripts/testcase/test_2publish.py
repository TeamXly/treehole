
import Openwebsite
import unittest

class publish(unittest.TestCase):
    def setUp(self):
        self.driver=Openwebsite.start().login()
    def tearDown(self):
        self.driver.quit()
    def test_publish_true(self):
        driver=self.driver
        i=0
        while i<2:
            driver.find_element_by_css_selector('body > header > section.header-top > nav > ul > li:nth-child(5) > a').click()
            word='自动测试帖'+str(i)
            driver.find_element_by_css_selector('#my_From > table > tbody > tr:nth-child(1) > td:nth-child(2) > input').send_keys(word)
            driver.find_element_by_id('md_editor').send_keys(word)
            driver.find_element_by_css_selector('#my_From > table > tbody > tr:nth-child(3) > td:nth-child(2) > button').click()
            i=i+1
    # def test_publish_title_null(self):
    #     driver=self.driver
    #     driver.find_element_by_css_selector('body > header > section.header-top > nav > ul > li:nth-child(5) > a').click()
    #     driver.find_element_by_css_selector('#my_From > table > tbody > tr:nth-child(1) > td:nth-child(2) > input').clear()
    #     driver.find_element_by_id('md_editor').send_keys('自动测试贴')
    #     driver.find_element_by_css_selector('#my_From > table > tbody > tr:nth-child(3) > td:nth-child(2) > button').click()
    #
    # def test_publish_text_null(self):
    #     driver=self.driver
    #     driver.find_element_by_css_selector('body > header > section.header-top > nav > ul > li:nth-child(5) > a').click()
    #     driver.find_element_by_css_selector('#my_From > table > tbody > tr:nth-child(1) > td:nth-child(2) > input').send_keys('自动测试贴')
    #     driver.find_element_by_id('md_editor').clear()
    #     driver.find_element_by_css_selector('#my_From > table > tbody > tr:nth-child(3) > td:nth-child(2) > button').click()
