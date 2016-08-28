# FyberCodeChallenge
An Android Source Code for the Fyber Code Challenge

This source code stores all the codes needed for the Fybe Code Challenge. 
Listed below are the requirements corresponding with their solution. 

1. Create a form asking for the variable params (uid, API Key, appid, pub0)

        -- Created FormActivity to handle all the four variable parameters

2. Make the request to the API passing the params and the authentication hash

        -- Create FyberWebService to use Retrofit2 in requesting the API 
        -- Created FormBusinessService to generate Hash

3. Get the result from the response.

        -- FyberWebService gets the response
        -- Use EventBus to throw the response to the ReponseActivity

4. Check the returned hash to check that it’s a real response (check signature)

        -- FyberWebService checks the signature and each JSON response to check if the response was successful
        -- ResponseActivity shows all the json response 

5. Render the offers in a view.

        -- Tried different values on different variable but couldn't find any offers except for 'No Offers' and error codes
        -- Reponse Activity shows the offers

6. Create functional and unit tests (choose your tool)

        -- ExampleUnitTest has 2 Unit Tests suchs as hash generation, response from Fyber Server.
        -- ExampleUnitTest has 1 Functional Tests that tests both the hash generation and response from Fyber Server together.

8. Create a github repository and send us the URL with the solution of the
challenge

        -- https://github.com/paragones/FyberCodeChallenge


BONUS FEATURES

        -- added Espresso Files to Automate Testing to check whether the Input Fields are correct
        -- added Error Validation such as empty filed, number input and showing error response
