
module.exports = {
    url:'https://demoqa.com/automation-practice-form',
    

    elements: {

        firstNameInput: {
            selector: '#firstName' 
        } ,  
        lastName:'#lastName',
        email:'#userEmail',
        Gender:'label[for="gender-radio-2"]',
        Mobile:'#userNumber',

        dateOfBirth:'#dateOfBirthInput',
        selectMonth: '.react-datepicker__month-select>[value="2"]',
        selectdate: ".react-datepicker__day.react-datepicker__day--022",
        selectYear:'.react-datepicker__year-select>[value="2024"]',

        subjects:'#subjectsInput',
        selectSubject: '.subjects-auto-complete__menu.css-2613qy-menu ',
        Hobbies:`label[for='hobbies-checkbox-1']`,
        currentAddress: '#currentAddress',

        selectStateDropDown: 'div:nth-child(2)>div>div>div>.css-tlfecz-indicatorContainer', 
        inputState:'#react-select-3-input',
        inputCity:'#react-select-4-input',
        
        SelectCityDropDown:'div:nth-child(3)>div>div>div>.css-tlfecz-indicatorContainer',       
        submitButton:'.btn.btn-primary',
        SubmitMessage: '#example-modal-sizes-title-lg',
        closeButton:'.modal-footer>button',
        praticeFormTitle:'.text-center',

    },
    commands: [ {
        enterFirstName: function(value){
            return this
            .waitForElementVisible('@firstNameInput')
            .setValue('@firstNameInput', value);        
        },
        enterLastName: function(value){
            return this
            .waitForElementVisible('@lastName')
            .setValue('@lastName',value);
          
        },
        enterEmail: function(value){
            return this
            .waitForElementVisible('@email')
            .setValue('@email',value)
        },
        selectGender: function(){
            return this
            .assert.visible('@Gender')
            .waitForElementVisible('@Gender')
            .click('@Gender')
        },
        enterMobile: function(value){
            return this
            .waitForElementVisible('@Mobile')
            .setValue('@Mobile',value)
        },

        enterDateOfBirth: function(){
            return this
            .waitForElementVisible('@dateOfBirth')
            .click('@dateOfBirth')
            .waitForElementVisible('@selectMonth')
            .click('@selectMonth')
            .waitForElementVisible('@selectYear')
            .click('@selectYear')
            .waitForElementVisible('@selectdate')
            .click('@selectdate')   
        },

        inputSubject: function(value){
            return this
            .assert.visible('@subjects')
            .waitForElementVisible('@subjects')
            .setValue('@subjects',value)

        },
    
        selectHobbies: function(){
            return this
            .assert.visible('@Hobbies') 
            .waitForElementVisible('@Hobbies')
            .click('@Hobbies');
          
        },
        enterCurrentAddress: function(value){
            return this
            .waitForElementVisible('@currentAddress')
            .setValue('@currentAddress',value);
          
        },
        
        clickDropDownState: function(value) {
            return this
              .assert.visible('@selectStateDropDown') 
              .waitForElementVisible('@selectStateDropDown')
              .click('@selectStateDropDown',) 
              .waitForElementVisible('@inputState')
              .setValue('@inputState',value);
            
          },
    
        clickDropDownCity: function(value){
            return this
            .assert.visible('@SelectCityDropDown')
            .waitForElementVisible('@SelectCityDropDown')
            .click('@SelectCityDropDown')
            .waitForElementVisible('@inputCity')
            .setValue('@inputCity',value);
                     
         
      },
    submitButton(){
        return this
        .waitForElementVisible('@submitButton')
        .click('@submitButton')
    },

      submissionMessage(){
        return this
        .waitForElementVisible('@SubmitMessage')
        .assert.textContains('@SubmitMessage',"Thanks for submitting the form")
      },

      closeForm(){
        return this
        .waitForElementVisible('@closeButton')
        .click('@closeButton')
      },
    }],

};