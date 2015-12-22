 /* Copyright (c) 1996-2015, OPC Foundation. All rights reserved.
   The source code in this file is covered under a dual-license scenario:
     - RCL: for OPC Foundation members in good-standing
     - GPL V2: everybody else
   RCL license terms accompanied with this source code. See http://opcfoundation.org/License/RCL/1.00/
   GNU General Public License as published by the Free Software Foundation;
   version 2 of the License are accompanied with this source code. See http://opcfoundation.org/License/GPLv2
   This source code is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/

package org.opcfoundation.ua.core;

import org.opcfoundation.ua.builtintypes.ServiceRequest;
import org.opcfoundation.ua.builtintypes.ExpandedNodeId;
import org.opcfoundation.ua.core.Identifiers;
import org.opcfoundation.ua.utils.ObjectUtils;
import java.util.Arrays;
import org.opcfoundation.ua.builtintypes.UnsignedInteger;
import org.opcfoundation.ua.core.MonitoringMode;
import org.opcfoundation.ua.core.RequestHeader;


public class SetMonitoringModeRequest extends Object implements ServiceRequest {

	public static final ExpandedNodeId ID = new ExpandedNodeId(Identifiers.SetMonitoringModeRequest);
	public static final ExpandedNodeId BINARY = new ExpandedNodeId(Identifiers.SetMonitoringModeRequest_Encoding_DefaultBinary);
	public static final ExpandedNodeId XML = new ExpandedNodeId(Identifiers.SetMonitoringModeRequest_Encoding_DefaultXml);
	
    protected RequestHeader RequestHeader;
    protected UnsignedInteger SubscriptionId;
    protected MonitoringMode MonitoringMode;
    protected UnsignedInteger[] MonitoredItemIds;
    
    public SetMonitoringModeRequest() {}
    
    public SetMonitoringModeRequest(RequestHeader RequestHeader, UnsignedInteger SubscriptionId, MonitoringMode MonitoringMode, UnsignedInteger[] MonitoredItemIds)
    {
        this.RequestHeader = RequestHeader;
        this.SubscriptionId = SubscriptionId;
        this.MonitoringMode = MonitoringMode;
        this.MonitoredItemIds = MonitoredItemIds;
    }
    
    public RequestHeader getRequestHeader()
    {
        return RequestHeader;
    }
    
    public void setRequestHeader(RequestHeader RequestHeader)
    {
        this.RequestHeader = RequestHeader;
    }
    
    public UnsignedInteger getSubscriptionId()
    {
        return SubscriptionId;
    }
    
    public void setSubscriptionId(UnsignedInteger SubscriptionId)
    {
        this.SubscriptionId = SubscriptionId;
    }
    
    public MonitoringMode getMonitoringMode()
    {
        return MonitoringMode;
    }
    
    public void setMonitoringMode(MonitoringMode MonitoringMode)
    {
        this.MonitoringMode = MonitoringMode;
    }
    
    public UnsignedInteger[] getMonitoredItemIds()
    {
        return MonitoredItemIds;
    }
    
    public void setMonitoredItemIds(UnsignedInteger[] MonitoredItemIds)
    {
        this.MonitoredItemIds = MonitoredItemIds;
    }
    
    /**
      * Deep clone
      *
      * @return cloned SetMonitoringModeRequest
      */
    public SetMonitoringModeRequest clone()
    {
        SetMonitoringModeRequest result = new SetMonitoringModeRequest();
        result.RequestHeader = RequestHeader==null ? null : RequestHeader.clone();
        result.SubscriptionId = SubscriptionId;
        result.MonitoringMode = MonitoringMode;
        result.MonitoredItemIds = MonitoredItemIds==null ? null : MonitoredItemIds.clone();
        return result;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        SetMonitoringModeRequest other = (SetMonitoringModeRequest) obj;
        if (RequestHeader==null) {
            if (other.RequestHeader != null) return false;
        } else if (!RequestHeader.equals(other.RequestHeader)) return false;
        if (SubscriptionId==null) {
            if (other.SubscriptionId != null) return false;
        } else if (!SubscriptionId.equals(other.SubscriptionId)) return false;
        if (MonitoringMode==null) {
            if (other.MonitoringMode != null) return false;
        } else if (!MonitoringMode.equals(other.MonitoringMode)) return false;
        if (MonitoredItemIds==null) {
            if (other.MonitoredItemIds != null) return false;
        } else if (!Arrays.equals(MonitoredItemIds, other.MonitoredItemIds)) return false;
        return true;
    }
    
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((RequestHeader == null) ? 0 : RequestHeader.hashCode());
        result = prime * result
                + ((SubscriptionId == null) ? 0 : SubscriptionId.hashCode());
        result = prime * result
                + ((MonitoringMode == null) ? 0 : MonitoringMode.hashCode());
        result = prime * result
                + ((MonitoredItemIds == null) ? 0 : Arrays.hashCode(MonitoredItemIds));
        return result;
    }
    
 

	public ExpandedNodeId getTypeId() {
		return ID;
	}

	public ExpandedNodeId getXmlEncodeId() {
		return XML;
	}
	
	public ExpandedNodeId getBinaryEncodeId() {
		return BINARY;
	}
	
	public String toString() {
		return ObjectUtils.printFieldsDeep(this);
	}
	
}