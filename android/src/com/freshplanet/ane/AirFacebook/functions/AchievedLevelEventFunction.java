
package com.freshplanet.ane.AirFacebook.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREObject;
import com.facebook.AppEventsConstants;
import com.facebook.AppEventsLogger;
import android.os.Bundle;

public class AchievedLevelEventFunction extends BaseFunction
{
	@Override
	public FREObject call(FREContext context, FREObject[] args)
	{
		super.call(context, args);

		String level = getStringFromFREObject(args[0]);

		AppEventsLogger logger = AppEventsLogger.newLogger(context.getActivity());
		Bundle parameters = new Bundle();
		parameters.putString(AppEventsConstants.EVENT_PARAM_LEVEL, level);
		logger.logEvent(AppEventsConstants.EVENT_NAME_ACHIEVED_LEVEL, parameters);
		
		return null;
	}

}
