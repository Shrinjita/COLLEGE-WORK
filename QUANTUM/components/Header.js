import React from 'react';

export const Header = () => {
  return (
    <header className="flex items-center justify-between p-4">
      <Logo />
      <div className="flex items-center space-x-4">
        <SubscribeButton />
        <SearchBar />
      </div>
    </header>
  );
};

const myButton = document.getElementById("myButton");

// Add a click event listener to the button
myButton.addEventListener("click", function() {
  // Code to execute when the button is clicked
  alert("Button Clicked!");
  // You can perform any action you want here
});

export const SubscribeButton = () => {
  return (
    <button className="bg-blue-500 text-white px-4 py-2 rounded-md">
      Subscribe
    </button>
  );
};

export const Logo = () => {
  return <h1 className="text-2xl font-bold">Cryptocurrency Blog</h1>;
};

export const NewsBox = ({ title, imageSrc, content }) => {
  return (
    <div className="rounded-lg shadow-md p-4">
      <img src={Bitcoin} alt={title} className="w-full h-auto rounded-t-lg"/>
      <h2 className="text-xl font-bold mt-2">{title}</h2>
      <p className="mt-2">{content}</p>
    </div>
  );
};

export const SearchBar = () => {
  return (
    <input
      type="text"
      placeholder="Search..."
      className="border border-gray-300 px-2 py-1 rounded-md"
    />
  );
};
