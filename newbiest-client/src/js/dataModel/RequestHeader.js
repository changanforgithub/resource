import { SessionContext } from "../Application";

class RequestHeader{  

    messageName;
    transactionId;
    orgName;
    userName;
    
    constructor(messageName){  
        let sessionContext = SessionContext.getSessionContext();
        this.messageName = messageName;
        console.log(messageName);
        this.transactionId = this.generatorUUID();
        if (sessionContext != undefined) {
            this.orgName = sessionContext.orgName;
            this.userName = sessionContext.userName;
        } 
    }

    generatorUUID() {
        return 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function(c) {
            var r = Math.random() * 16 | 0,
            v = c == 'x' ? r : (r & 0x3 | 0x8);
            return v.toString(16);
        }).toUpperCase();

    }
}  
export {RequestHeader};  