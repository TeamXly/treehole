from selenium import webdriver

class start():
    def start(self):
        self.driver=webdriver.Chrome()
        self.driver.get('http://10.25.209.43:8080')
        self.driver.implicitly_wait(8)
        #self.driver.maximize_window()
        return self.driver
    def login(self):
        self.driver=webdriver.Chrome()
        self.driver.get('http://10.25.209.43:8080')
        self.driver.implicitly_wait(8)
        self.driver.find_element_by_css_selector('body > header > section.header-top > a > span').click()
        self.driver.find_element_by_css_selector('#reg-form > label:nth-child(1) > div > input[type="text"]').send_keys('18212345678')
        self.driver.find_element_by_css_selector('#reg-form > label:nth-child(2) > div > input[type="password"]').send_keys('123456789')
        self.driver.find_element_by_xpath('//*[@id="reg-form"]/label[3]/div/button').click()
        return self.driver