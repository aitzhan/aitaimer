import Configuration from "../configuration";

class API {
    constructor(props) {
        this.config = new Configuration();
        this.baseUrl = props.baseUrl;
    }
}

export default API;