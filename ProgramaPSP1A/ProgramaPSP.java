package programapsp;

import java.util.*;

public class ProgramaPSP {

    // CC -> 2 + 1
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        while( true )
        {
            int attackers;
            int defenders;
            
            attackers = in.nextInt();
            defenders = in.nextInt();            
            
            if( attackers == 0 && defenders == 0 )
            {
                in.close();
                break;          
            } else
            {
                readVectors( attackers, defenders, in );
            }
        }
    }

	// CC -> 2 + 1
    public static void readVectors( int attackers, int defenders, Scanner in )
    {
        int distA[] = new int[ attackers ];
        int distD[] = new int[ defenders ];
        
        for( int i = 0 ; i < attackers ; i++ )
        {
            distA[i] = in.nextInt();
        }
        for( int i = 0 ; i < defenders ; i++ )
        {
            distD[i] = in.nextInt();
        }
        
        solve( distA, distD, attackers, defenders );
    }

	// CC -> 6 + 1
	public static char solve( int[] distA ,int[] distD, int attackers, int defenders  )
	{
		for( int i = 0 ; i < attackers ; i++ ){
			for( int j = i + 1 ; j < attackers ; j++ ){
				if ( distA[ i ] > distA[ j ] )
				{
					int temp = distA[i]; 	
					distA[i] = distA[j];
					distA[j] = temp;					
				}
			}
		}
		
		for( int i = 0 ; i < defenders ; i++ ){
			for( int j = i + 1 ; j < defenders ; j++ ){
				if ( distD[ i ] > distD[ j ] )
				{
					int temp = distD[i]; 	
					distD[i] = distD[j];
					distD[j] = temp;					
				}
			}
		}
		
		if( distA[0] < distD[1] )
		{
			System.out.println("Y");
			return 'Y';
		}
		System.out.println("N");
		
		return 'N';	
	}

}