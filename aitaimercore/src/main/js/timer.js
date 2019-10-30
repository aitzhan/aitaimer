import React from 'react'
import TimerApi from "./api/timerApi";

class Timer extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            seconds: 0,
            minutes: 0,
            isOn: false,
            intervalId: null
        };

        this.countdown = this.countdown.bind(this);
    }


    componentDidMount() {
        let currentTime = TimerApi.getCurrentTime();
        currentTime.then(response => response.json())
            .then(data => {
                this.setState({
                    seconds: data.seconds,
                    minutes: data.minutes
                });
                setInterval(this.countdown, 1000);
            });
    }



    countdown() {
        const {seconds, minutes, intervalId} = this.state;

        if (this.isOver()) {
            clearInterval(intervalId)
        } else {
            if (this.isNeedToDecreaseMinutes()) {
                this.setState({seconds: 59, minutes: minutes - 1})
            } else {
                this.setState({seconds: seconds - 1, minutes: minutes})
            }
        }
    }

    isOver() {
        const {seconds, minutes} = this.state;
        return seconds === 0 && minutes === 0;
    }

    isNeedToDecreaseMinutes() {
        const {seconds, minutes} = this.state;
        return seconds === 0 && minutes !== 0;
    }

    render() {
        const {seconds, minutes} = this.state;

        return (
            <div>
                <div>
                    <p>{minutes}:{seconds}</p>
                </div>
                <button>Start</button>
                <button>Pause</button>
            </div>
        )
    }
}
export default Timer

