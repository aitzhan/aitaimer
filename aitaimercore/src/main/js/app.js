import React from 'react'
import ReactDOM from 'react-dom'
import Timer from './timer'

class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            name: 'none'
        };
    }

    componentDidMount() {

    }

    render() {
        const {name} = this.state;

        return (
            <div>
                <h2 className={'logo'}>Pomodoro</h2>
                <Timer />
            </div>
        )
    }
}

ReactDOM.render(
    <App />,
    document.getElementById('react')
);