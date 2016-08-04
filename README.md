# TestApe

## Description
Automated testing tool written in java powered by selenium with an easy to use interface.

### Implemented Commands

| Command | Action performed |
| --------|----------------|
| openBrowser chrome  | Opens a new chrome browser    |
| closeBrowser chrome  | Close the chrome browser (Should be entered at every test end)   |
| openURL \[link\]  | Opens a given link in a browser [link] should be a full URL (like https://www.spiegel.de)   |
| clickLink \[selectiontype\] \[selection parameter\]  | Clicks on a link (Possible selection types are: css,xpath,text,text*,id). If text is selected second parameter has to be the exact link text (text* search for partial link text) |
| waitSec \[seconds to wait\]  | Makes the test stop for a given time entered in seconds   |

## Download
Compiled version of TestApe including the chrome webdriver.
Packaged in a zip file.

[TestApe_0.3.zip](https://raw.githubusercontent.com/lampi84/TestApe/master/executable/TestApe_0.3.zip)

## Screenshot
![TestApe UI](https://raw.githubusercontent.com/lampi84/TestApe/master/Screenshot.png)
