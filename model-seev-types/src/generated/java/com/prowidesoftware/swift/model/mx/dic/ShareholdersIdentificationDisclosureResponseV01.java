
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
 * The ShareholdersIdentificationDisclosureResponse message is sent in response to a shareholder identification disclosure request message by any intermediaries to the recipient designated by the issuer (such as an issuer's agent) in the disclosure request message in order to provide the requested information on the identity of the shareholders and their accounts holdings serviced by the intermediary for the requested financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareholdersIdentificationDisclosureResponseV01", propOrder = {
    "pgntn",
    "issrDsclsrReqRef",
    "dsclsrRspnId",
    "rspndgIntrmy",
    "dsclsrInf",
    "splmtryData"
})
public class ShareholdersIdentificationDisclosureResponseV01 {

    @XmlElement(name = "Pgntn")
    protected Pagination1 pgntn;
    @XmlElement(name = "IssrDsclsrReqRef", required = true)
    protected DisclosureRequestIdentification1 issrDsclsrReqRef;
    @XmlElement(name = "DsclsrRspnId", required = true)
    protected String dsclsrRspnId;
    @XmlElement(name = "RspndgIntrmy", required = true)
    protected PartyIdentification219 rspndgIntrmy;
    @XmlElement(name = "DsclsrInf", required = true)
    protected Disclosure1Choice dsclsrInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public ShareholdersIdentificationDisclosureResponseV01 setPgntn(Pagination1 value) {
        this.pgntn = value;
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
    public ShareholdersIdentificationDisclosureResponseV01 setIssrDsclsrReqRef(DisclosureRequestIdentification1 value) {
        this.issrDsclsrReqRef = value;
        return this;
    }

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
    public ShareholdersIdentificationDisclosureResponseV01 setDsclsrRspnId(String value) {
        this.dsclsrRspnId = value;
        return this;
    }

    /**
     * Gets the value of the rspndgIntrmy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification219 }
     *     
     */
    public PartyIdentification219 getRspndgIntrmy() {
        return rspndgIntrmy;
    }

    /**
     * Sets the value of the rspndgIntrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification219 }
     *     
     */
    public ShareholdersIdentificationDisclosureResponseV01 setRspndgIntrmy(PartyIdentification219 value) {
        this.rspndgIntrmy = value;
        return this;
    }

    /**
     * Gets the value of the dsclsrInf property.
     * 
     * @return
     *     possible object is
     *     {@link Disclosure1Choice }
     *     
     */
    public Disclosure1Choice getDsclsrInf() {
        return dsclsrInf;
    }

    /**
     * Sets the value of the dsclsrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Disclosure1Choice }
     *     
     */
    public ShareholdersIdentificationDisclosureResponseV01 setDsclsrInf(Disclosure1Choice value) {
        this.dsclsrInf = value;
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
    public ShareholdersIdentificationDisclosureResponseV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
