const homePage = browser.page.W3school.Homepage();
 


describe('Filling Pratice Form of DemoQA Website for checking mandatory input fields: ', function(){
    before(function (browser){
        homePage.navigate();
        browser.windowMaximize();
    });

    after(function(browser){
        browser.end();
    });

    it('1.) User entering valid input in First Name  : ', function(){
      homePage.expect.element('@firstNameInput').visible      
      homePage.enterFirstName('Demo')
     })
      
     
    it('2.) User entering valid input in Last Name : ', function(){
        homePage.expect.element('@lastName').visible
        homePage.enterLastName('Testing')          
    })

    it('3.) User entering valid input in Email : ', function(){
      homePage.expect.element('@email').visible
      homePage.enterEmail('Demo@gmail.com')     
    })

    it('4.) User entering valid input in Email : ', function(){
      homePage.selectGender() 
      homePage.assert.elementPresent('#gender-radio-2:checked')
      
    })

    it('5.) User entering valid input in Email : ', function(){
      homePage.expect.element('@Mobile').visible
      homePage.enterMobile('9988998877') 
    })

    it('6.) User is able to select date of current year : ', function(){
      homePage.expect.element('#dateOfBirthInput').visible
      homePage.enterDateOfBirth() 
    })

    //   it('8.) User is able to select a hobbies: ', function(){
      
    //   homePage.selectHobbies()      
    //   // homePage.assert.elementPresent('#hobbies-checkbox-1:checked');   
    // })

    //   it('9.) User is able to enter address using alphabets and numbers : ', function(){
    //   homePage.enterCurrentAddress('Demo Testing Website, 101')     
    //   })

    //   it('10.) User should be able to select a state : ', function(){
    //   homePage.clickDropDownState('uttar')
    //   homePage.waitForElementVisible('.css-11unzgr',5000,function()
    //   {
    //     homePage.click('#react-select-3-option-1')     
    //   })
    //   })

    // it('10.) User should be able to select city : ', function(){

    // homePage.clickDropDownCity('agra')    
    // homePage.waitForElementVisible('.css-11unzgr',5000,function(){
    // homePage.click('#react-select-4-option-0')   
    //     })
    //     })

    // it('7.) User is able to select a subject : ', function(){
    // homePage.inputSubject('Ma')     
    // homePage.waitForElementVisible('.subjects-auto-complete__option.subjects-auto-complete__option--is-focused.css-1n7v3ny-option',5000,function()
    //  {
    //   homePage.click('#react-select-2-option-0') 
    //      })     
    //     })      

    // it('12.) User should be able to click on submit button with entering required fields : ', function(){
    //   homePage.waitForElementVisible('@submitButton')
    //   homePage.submitButton()      
    // })

    // it('13.) User should be able to see Submission Message : ', function(){
    //   homePage.submissionMessage()
    //   homePage.expect.element('@SubmitMessage').text.to.contain('Thanks for submitting the form')
    // })

    // it('14.) User is able to see all added enteries : ', function(){
    //   homePage.expect.element('tbody tr:nth-child(1) td:nth-child(2)').text.to.contain('Demo Testing')    
    //   homePage.expect.element('tbody tr:nth-child(3) td:nth-child(2)').text.to.contain('Female')    
    //   homePage.expect.element('tbody tr:nth-child(4) td:nth-child(2)').text.to.contain('9988998877')    
    //   homePage.expect.element('tbody tr:nth-child(5) td:nth-child(2)').text.to.contain('22 March,2024') 
    //   homePage.expect.element('tbody tr:nth-child(6) td:nth-child(2)').text.to.contain('Maths') 
    //   homePage.expect.element('tbody tr:nth-child(7) td:nth-child(2)').text.to.contain('Sports')
    //   homePage.expect.element('tbody tr:nth-child(9) td:nth-child(2)').text.to.contain('Demo Testing Website, 101')  
    //   homePage.expect.element('tbody tr:nth-child(10) td:nth-child(2)').text.to.contain('Uttar Pradesh Agra')    
    // })

    // it('15.) user is able to close the filled form display: ', function(){
    //   homePage.waitForElementVisible('@closeButton')
    //   homePage.click('@closeButton');      
    // })

    // it('16.) Entering Inavlid Email will not submit form : ', function(){
    //   homePage.expect.element('@firstNameInput').visible      
    //   homePage.enterFirstName('Demo') 
    //   homePage.expect.element('@lastName').visible
    //   homePage.enterLastName('Testing')
    //   homePage.expect.element('@email').visible
    //   homePage.enterEmail('Demo@gmail')    
    //   homePage.selectGender()  
    //   homePage.expect.element('@Mobile').visible
    //   homePage.enterMobile('9988998877')
    //   homePage.expect.element('#dateOfBirthInput').visible
    //   homePage.enterDateOfBirth()
    //   homePage.expect.element('@Hobbies').visible
    //   homePage.selectHobbies()     
    //   homePage.enterCurrentAddress('Demo Testing Website, 101')
    //   homePage.waitForElementVisible('@submitButton')
    //   homePage.submitButton() 
    //   homePage.expect.element('.text-center').text.to.contain('Practice Form')
    


    // })
});
