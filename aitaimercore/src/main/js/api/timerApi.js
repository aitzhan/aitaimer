import Configuration from "../configuration";
import API from "./api";


class TimerApi extends API {
    constructor(props) {
       super(props);
    }


    static getCurrentTime() {
        return fetch(Configuration.getApiUrl() + '/rest/timer')
    }
}

export default TimerApi