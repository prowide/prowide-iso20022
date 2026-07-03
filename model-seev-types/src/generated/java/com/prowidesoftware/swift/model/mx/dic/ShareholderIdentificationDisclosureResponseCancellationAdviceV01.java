
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
 * The ShareholdersIdentificationDisclosureResponseCancellationAdvice message is sent by any intermediaries to the recipient designated by the issuer (such as an issuer's agent) in the disclosure request message in order to cancel the shareholder identification disclosure response whether previously sent in a single message or in a set of multipart/paginated response messages.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareholderIdentificationDisclosureResponseCancellationAdviceV01", propOrder = {
    "dsclsrRspnId",
    "issrDsclsrReqRef",
    "rspndgIntrmy",
    "splmtryData"
})
public class ShareholderIdentificationDisclosureResponseCancellationAdviceV01 {

    @XmlElement(name = "DsclsrRspnId", required = true)
    protected String dsclsrRspnId;
    @XmlElement(name = "IssrDsclsrReqRef", required = true)
    protected DisclosureRequestIdentification1 issrDsclsrReqRef;
    @XmlElement(name = "RspndgIntrmy", required = true)
    protected PartyIdentification215 rspndgIntrmy;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the dsclsrRspnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsclsrRspnId() {
        return dsclsrRspnId;
    }

    /**
     * Sets the value of the dsclsrRspnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShareholderIdentificationDisclosureResponseCancellationAdviceV01 setDsclsrRspnId(String value) {
        this.dsclsrRspnId = value;
        return this;
    }

    /**
     * Gets the value of the issrDsclsrReqRef property.
     * 
     * @return
     *     possible object is
     *     {@link DisclosureRequestIdentification1 }
     *     
     */
    public DisclosureRequestIdentification1 getIssrDsclsrReqRef() {
        return issrDsclsrReqRef;
    }

    /**
     * Sets the value of the issrDsclsrReqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisclosureRequestIdentification1 }
     *     
     */
    public ShareholderIdentificationDisclosureResponseCancellationAdviceV01 setIssrDsclsrReqRef(DisclosureRequestIdentification1 value) {
        this.issrDsclsrReqRef = value;
        return this;
    }

    /**
     * Gets the value of the rspndgIntrmy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification215 }
     *     
     */
    public PartyIdentification215 getRspndgIntrmy() {
        return rspndgIntrmy;
    }

    /**
     * Sets the value of the rspndgIntrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification215 }
     *     
     */
    public ShareholderIdentificationDisclosureResponseCancellationAdviceV01 setRspndgIntrmy(PartyIdentification215 value) {
        this.rspndgIntrmy = value;
        return this;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ShareholderIdentificationDisclosureResponseCancellationAdviceV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
