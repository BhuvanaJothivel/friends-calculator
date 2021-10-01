package controller;

public class Calculate {
	public static int findSum(int friendShipSum) {
		int sum = 0;
        while (friendShipSum > 0) {
            sum += friendShipSum % 10;
            friendShipSum /= 10;
        }
        return sum;
	}

	public static int calculate(String myName, String friendName) {
		
		final String FriendShip = "friends";
		int firstSum = 0, secondSum = 0, friendShipSum = 0, totalSum;
    	
    	myName = myName.toLowerCase();
    	friendName = friendName.toLowerCase();

        for (var i = 0; i < myName.length(); i++) {
        	firstSum += myName.charAt(i);
        }

        for (var i = 0; i < friendName.length(); i++) {
        	secondSum += friendName.charAt(i);
        }

        for (var i = 0; i < FriendShip.length(); i++) { 
        	friendShipSum += FriendShip.charAt(i); 
        } 
        totalSum = Calculate.findSum(firstSum + secondSum); 
        friendShipSum = Calculate.findSum(friendShipSum); 
        if (totalSum > friendShipSum) {
            totalSum = friendShipSum - (totalSum - friendShipSum);
        }
        
        return (totalSum * 100 / friendShipSum);
		
	}
}
