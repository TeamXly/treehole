import unittest

import Openwebsite

class post(unittest.TestCase):
    def setUp(self):
        self.driver=Openwebsite.start().login()
    def tearDown(self):
        self.driver.quit()
    def test_commentpost(self):
        driver=self.driver
        driver.find_element_by_css_selector('body > main > section.article-view > div:nth-child(2) > ul > li.xia > div.zan > span.comm-p').click()
        driver.find_element_by_name('textarea').click()
        driver.find_element_by_name('textarea').send_keys('测试评论')
        driver.find_element_by_css_selector('body > main > section.article-view > div:nth-child(2) > ul > li.xia > div.comm > button').click()
        text=driver.find_element_by_xpath('/html/body/main/section[1]/div[1]/ul/li[2]/div[2]/ul/li/span[2]').text
        self.assertEqual('测试评论',text)
    def test_like(self):
        driver=self.driver
        driver.find_element_by_xpath('/html/body/main/section[1]/div[1]/ul/li[2]/div[1]/span[1]').click()
        text=driver.find_element_by_xpath('/html/body/main/section[1]/div[1]/ul/li[2]/div[1]/span[1]/b').text
        self.assertEqual(text,'1')
    def test_dislike(self):
        driver=self.driver
        driver.find_element_by_xpath('/html/body/main/section[1]/div[1]/ul/li[2]/div[1]/span[2]').click()
        text=driver.find_element_by_xpath('/html/body/main/section[1]/div[1]/ul/li[2]/div[1]/span[2]/b').text
        self.assertEqual(text,'1')
