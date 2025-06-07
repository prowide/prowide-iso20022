
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The Netting Cut Off Reference Data Update Request message is sent to a central system by a participant to request an update to a participant's netting cut off held at the central system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NettingCutOffReferenceDataUpdateRequestV02", propOrder = {
    "reqData",
    "netgCutOffReq",
    "splmtryData"
})
public class NettingCutOffReferenceDataUpdateRequestV02 {

    @XmlElement(name = "ReqData", required = true)
    protected RequestData2 reqData;
    @XmlElement(name = "NetgCutOffReq", required = true)
    protected List<NettingCutOff2> netgCutOffReq;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the reqData property.
     * 
     * @return
     *     possible object is
     *     {@link RequestData2 }
     *     
     */
    public RequestData2 getReqData() {
        return reqData;
    }

    /**
     * Sets the value of the reqData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestData2 }
     *     
     */
    public NettingCutOffReferenceDataUpdateRequestV02 setReqData(RequestData2 value) {
        this.reqData = value;
        return this;
    }

    /**
     * Gets the value of the netgCutOffReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netgCutOffReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetgCutOffReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NettingCutOff2 }
     * 
     * 
     */
    public List<NettingCutOff2> getNetgCutOffReq() {
        if (netgCutOffReq == null) {
            netgCutOffReq = new ArrayList<NettingCutOff2>();
        }
        return this.netgCutOffReq;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the netgCutOffReq list.
     * @see #getNetgCutOffReq()
     * 
     */
    public NettingCutOffReferenceDataUpdateRequestV02 addNetgCutOffReq(NettingCutOff2 netgCutOffReq) {
        getNetgCutOffReq().add(netgCutOffReq);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public NettingCutOffReferenceDataUpdateRequestV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
