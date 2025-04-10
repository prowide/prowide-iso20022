
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identifies the mandate, which is being suspended.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateSuspension4", propOrder = {
    "sspnsnReqId",
    "orgnlMsgInf",
    "sspnsnRsn",
    "orgnlMndt",
    "splmtryData"
})
public class MandateSuspension4 {

    @XmlElement(name = "SspnsnReqId", required = true)
    protected String sspnsnReqId;
    @XmlElement(name = "OrgnlMsgInf")
    protected OriginalMessageInformation1 orgnlMsgInf;
    @XmlElement(name = "SspnsnRsn", required = true)
    protected MandateSuspensionReason3 sspnsnRsn;
    @XmlElement(name = "OrgnlMndt", required = true)
    protected OriginalMandate10Choice orgnlMndt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the sspnsnReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSspnsnReqId() {
        return sspnsnReqId;
    }

    /**
     * Sets the value of the sspnsnReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MandateSuspension4 setSspnsnReqId(String value) {
        this.sspnsnReqId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlMsgInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalMessageInformation1 }
     *     
     */
    public OriginalMessageInformation1 getOrgnlMsgInf() {
        return orgnlMsgInf;
    }

    /**
     * Sets the value of the orgnlMsgInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalMessageInformation1 }
     *     
     */
    public MandateSuspension4 setOrgnlMsgInf(OriginalMessageInformation1 value) {
        this.orgnlMsgInf = value;
        return this;
    }

    /**
     * Gets the value of the sspnsnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link MandateSuspensionReason3 }
     *     
     */
    public MandateSuspensionReason3 getSspnsnRsn() {
        return sspnsnRsn;
    }

    /**
     * Sets the value of the sspnsnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateSuspensionReason3 }
     *     
     */
    public MandateSuspension4 setSspnsnRsn(MandateSuspensionReason3 value) {
        this.sspnsnRsn = value;
        return this;
    }

    /**
     * Gets the value of the orgnlMndt property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalMandate10Choice }
     *     
     */
    public OriginalMandate10Choice getOrgnlMndt() {
        return orgnlMndt;
    }

    /**
     * Sets the value of the orgnlMndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalMandate10Choice }
     *     
     */
    public MandateSuspension4 setOrgnlMndt(OriginalMandate10Choice value) {
        this.orgnlMndt = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public MandateSuspension4 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
