import React, { Component } from "react";

class NewComponent extends Component {
	render() {
		return (
			<h1 className="blue">
				{this.props.innerText + this.props.id + this.props.username}
			</h1>
		);
	}
}

export default NewComponent;
