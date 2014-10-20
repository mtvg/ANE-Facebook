
package com.freshplanet.ane.AirFacebook.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREObject;
import com.facebook.AppEventsConstants;
import com.facebook.AppEventsLogger;
import android.os.Bundle;

public class UnlockedAchievementEventFunction extends BaseFunction
{
	@Override
	public FREObject call(FREContext context, FREObject[] args)
	{
		super.call(context, args);

		String achievement = getStringFromFREObject(args[0]);

		AppEventsLogger logger = AppEventsLogger.newLogger(context.getActivity());
		Bundle parameters = new Bundle();
		parameters.putString(AppEventsConstants.EVENT_PARAM_DESCRIPTION, achievement);
		logger.logEvent(AppEventsConstants.EVENT_NAME_UNLOCKED_ACHIEVEMENT, parameters);
		
		return null;
	}

}
