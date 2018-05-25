//Colton Spector and Victoria Leafgren
//cbs262 and vml56
//February 16, 2018
//CS 136 Section 1
//Nim
import java.util.Random;
import java.util.Scanner;
class Nim {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random generator = new Random();
		int pile = 10 + generator.nextInt(90);
		int firstTurn = generator.nextInt(2);
		//int firstTurn = 0;
		int smartOrStupid = generator.nextInt(2);
		//if statement, firstTurn == 0 when computer moves first
		if (firstTurn == 0) {
			//nested if statement, smartOrStupid == 0 when computer is stupid
			if (smartOrStupid == 0) {
				System.out.println("There are " + pile + " marbles in the pile");
				while (pile > 1) {
					int computerMove = 1 + generator.nextInt(pile/2);
					pile -= computerMove;
					System.out.println("Computer removes " + computerMove + " marble(s).");
					System.out.println("Current number of marbles in pile: " + pile);
					if (pile == 1) {
						System.out.println("You lost, Computer wins");
                                                System.exit(0);
					}
					System.out.println("How many marbles do you want to remove: ");
                                        int userInput = scanner.nextInt();
					//Checks if user took too many marbles
                                        if (userInput > pile/2) {
                                            System.out.println("You took too many marbles, try again: ");
                                            userInput = scanner.nextInt();
                                        }
					pile -= userInput;
					if (pile == 1) {
						System.out.println("Computer loses");
                                                System.exit(0);
					}	
				}
			}
			//Computer moves first and is smart
			else {
				while (pile > 1) {
						//if the pile equals one of these numbers, it will act stupid
						if (pile == 15 || pile == 31 || pile == 63) {
							int computerMove = 1 + generator.nextInt(pile/2);
							pile -= computerMove;
							System.out.println("Computer removes " + computerMove + " marble(s).");
							System.out.println("Current number of marbles in pile: " + pile);
							if (pile == 1) {
								System.out.println("You lost, Computer wins");
                                                        	System.exit(0);
							}
                                                	System.out.println("There are " + pile + " marbles in the pile");
							System.out.println("How many marbles do you want to remove: ");
							int userInput = scanner.nextInt();
                                                	if (userInput > pile/2) {
                                                    		System.out.println("You took too many marbles, try again: ");
                                                    		userInput = scanner.nextInt();
                                                	}
							pile -= userInput;
							if (pile == 1) {
								System.out.println("Computer loses");
                                                        	System.exit(0);
							}
						}
						else {
							System.out.println("There are " + pile + " marbles in the pile");
							if (pile > 63) {
								int computerMove = pile - 63;
								pile -= computerMove;
								System.out.println("Computer removes " + computerMove + " marble(s).");
								System.out.println("Current number of marbles in pile: " + pile);
								if (pile == 1) {
									System.out.println("You lost, Computer wins");
                                                                	System.exit(0);
								}
								System.out.println("How many marbles do you want to remove: ");
								int userInput = scanner.nextInt();
                                                        	if (userInput > pile/2) {
                                                            	System.out.println("You took too many marbles, try again: ");
                                                            	userInput = scanner.nextInt();
                                                        	}
								pile -= userInput;
								if (pile == 1) {
									System.out.println("Computer loses");
                                                                	System.exit(0);
								}	
							}
							else if (pile > 31) {
								int computerMove = pile - 31;
								pile -= computerMove;
								System.out.println("Computer removes " + computerMove + " marble(s).");
								System.out.println("Current number of marbles in pile: " + pile);
								if (pile == 1) {
									System.out.println("You lost, Computer wins");
                                                                	System.exit(0);
								}
								System.out.println("How many marbles do you want to remove: ");
								int userInput = scanner.nextInt();
                                                        	if (userInput > pile/2) {
                                                        	    System.out.println("You took too many marbles, try again: ");
                                                        	    userInput = scanner.nextInt();
                                                        	}
								pile -= userInput;
								if (pile == 1) {
									System.out.println("Computer loses");
                                                                	System.exit(0);
								}	
							}
							else if (pile > 15) {
								int computerMove = pile - 15;
								pile -= computerMove;
								System.out.println("Computer removes " + computerMove + " marble(s).");
								System.out.println("Current number of marbles in pile: " + pile);
								if (pile == 1) {
									System.out.println("You lost, Computer wins");
                                                                	System.exit(0);
								}
								System.out.println("How many marbles do you want to remove: ");
								int userInput = scanner.nextInt();
                                                        	if (userInput > pile/2) {
                                                        	    System.out.println("You took too many marbles, try again: ");
                                                        	    userInput = scanner.nextInt();
                                                        	}
								pile -= userInput;
								if (pile == 1) {
									System.out.println("Computer loses");
                                                                	System.exit(0);
								}	
							}
							else if (pile > 7) {
								int computerMove = pile - 7;
								pile -= computerMove;
								System.out.println("Computer removes " + computerMove + " marble(s).");
								System.out.println("Current number of marbles in pile: " + pile);
								if (pile == 1) {
									System.out.println("You lost, Computer wins");
                                                                	System.exit(0);
								}
								System.out.println("How many marbles do you want to remove: ");
								int userInput = scanner.nextInt();
                                                        	if (userInput > pile/2) {
                                                        	    System.out.println("You took too many marbles, try again: ");
                                                        	    userInput = scanner.nextInt();
                                                        	}
								pile -= userInput;
								if (pile == 1) {
									System.out.println("Computer loses");
                                                                	System.exit(0);
								}	
							}
							else if (pile > 3) {
								int computerMove = pile - 3;
								pile -= computerMove;
								System.out.println("Computer removes " + computerMove + " marble(s).");
								System.out.println("Current number of marbles in pile: " + pile);
								if (pile == 1) {
									System.out.println("You lost, Computer wins");
                                                                	System.exit(0);
								}
								System.out.println("How many marbles do you want to remove: ");
								int userInput = scanner.nextInt();
                                                        	if (userInput > pile/2) {
                                                        	    System.out.println("You took too many marbles, try again: ");
                                                        	    userInput = scanner.nextInt();
                                                        	}
								pile -= userInput;
								if (pile == 1) {
									System.out.println("Computer loses");
                                                                	System.exit(0);
								}	
							}
							else if (pile > 1) {
								int computerMove = pile - 1;
								pile -= computerMove;
								System.out.println("Computer removes " + computerMove + " marble(s).");
								System.out.println("Current number of marbles in pile: " + pile);
								if (pile == 1) {
									System.out.println("You lost, Computer wins");
                                                                	System.exit(0);
								}
							System.out.println("There are " + pile + " marbles in the pile");
							System.out.println("How many marbles do you want to remove: ");
							int userInput = scanner.nextInt();
							pile -= userInput;
							if (pile == 1) {
								System.out.println("Computer loses");
                                                        	System.exit(0);
							}
						}
					}
				}
			}
		}
		//Player moves first when firstTurn == 1
		if (firstTurn == 1) {
			//Player moves first and computer is stupid
			if (smartOrStupid == 0) {
				while (pile > 1) {
					System.out.println("There are " + pile + " marbles in the pile");
					System.out.println("How many marbles do you want to remove: ");
					int userInput = scanner.nextInt();
                                        if (userInput > pile/2) {
                                            System.out.println("You took too many marbles, try again: ");
                                            userInput = scanner.nextInt();
                                        }
					pile -= userInput;
					if (pile == 1) {
						System.out.println("Computer loses");
                                                System.exit(0);
					}
					int computerMove = 1 + generator.nextInt(pile/2);
					pile -= computerMove;
					System.out.println("Computer removes " + computerMove + " marble(s).");
					System.out.println("Current number of marbles in pile: " + pile);
					if (pile == 1) {
						System.out.println("You lost, Computer wins");
                                                System.exit(0);
					}	
				}
			}
			//Player moves first and computer is smart
			else {
				while (pile > 1) {
					if (pile == 15 || pile == 31 || pile == 63) {
						System.out.println("There are " + pile + " marbles in the pile");
						System.out.println("How many marbles do you want to remove: ");
						int userInput = scanner.nextInt();
                                                if (userInput > pile/2) {
                                                    System.out.println("You took too many marbles, try again: ");
                                                    userInput = scanner.nextInt();
                                                }
						pile -= userInput;
						if (pile == 1) {
							System.out.println("Computer loses");
                                                        System.exit(0);
						}
						int computerMove = 1 + generator.nextInt(pile/2);
						pile -= computerMove;
						System.out.println("Computer removes " + computerMove + " marble(s).");
						System.out.println("Current number of marbles in pile: " + pile);
						if (pile == 1) {
							System.out.println("You lost, Computer wins");
                                                        System.exit(0);
						}
					}
					else {
						System.out.println("There are " + pile + " marbles in the pile");
						System.out.println("How many marbles do you want to remove: ");
						int userInput = scanner.nextInt();
                                                if (userInput > pile/2) {
                                                    System.out.println("You took too many marbles, try again: ");
                                                    userInput = scanner.nextInt();
                                                }
						pile -= userInput;
						if (pile == 1) {
							System.out.println("Computer loses");
                                                        System.exit(0);
						}
						if (pile > 63) {
							int computerMove = pile - 63;
							pile -= computerMove;
							System.out.println("Computer removes " + computerMove + " marble(s).");
							System.out.println("Current number of marbles in pile: " + pile);
							if (pile == 1) {
								System.out.println("You lost, Computer wins");
                                                                System.exit(0);
							}
						}
						else if (pile > 31) {
							int computerMove = pile - 31;
							pile -= computerMove;
							System.out.println("Computer removes " + computerMove + " marble(s).");
							System.out.println("Current number of marbles in pile: " + pile);
							if (pile == 1) {
								System.out.println("You lost, Computer wins");
                                                                System.exit(0);
							}
						}
						else if (pile > 15) {
							int computerMove = pile - 15;
							pile -= computerMove;
							System.out.println("Computer removes " + computerMove + " marble(s).");
							System.out.println("Current number of marbles in pile: " + pile);
							if (pile == 1) {
								System.out.println("You lost, Computer wins");
                                                                System.exit(0);
							}
						}
						else if (pile > 7) {
							int computerMove = pile - 7;
							pile -= computerMove;
							System.out.println("Computer removes " + computerMove + " marble(s).");
							System.out.println("Current number of marbles in pile: " + pile);
							if (pile == 1) {
								System.out.println("You lost, Computer wins");
                                                                System.exit(0);
							}
						}
						else if (pile > 3) {
							int computerMove = pile - 3;
							pile -= computerMove;
							System.out.println("Computer removes " + computerMove + " marble(s).");
							System.out.println("Current number of marbles in pile: " + pile);
							if (pile == 1) {
								System.out.println("You lost, Computer wins");
                                                                System.exit(0);
							}
						}
						else if (pile > 1) {
							int computerMove = pile - 1;
							pile -= computerMove;
							System.out.println("Computer removes " + computerMove + " marble(s).");
							System.out.println("Current number of marbles in pile: " + pile);
							if (pile == 1) {
								System.out.println("You lost, Computer wins");
                                                                System.exit(0);
							}
						}
					}
				}
			}
		}
	}
}
