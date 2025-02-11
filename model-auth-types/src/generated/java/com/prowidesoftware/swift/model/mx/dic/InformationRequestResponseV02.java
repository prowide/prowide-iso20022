
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * This message is sent by the financial institution to the authorities (police, customs, tax authorities, enforcement authorities) to provide a part or all of the requested information.
 * The financial institution previously received a request for financial information in the scope of a financial investigation.
 * 
 * Depending on whether the response can be provided STP within the authorities financial investigations messages, the requested information may be 
 * •	provided in part or in full within the response message itself, or 
 * •	only referred to in the response message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationRequestResponseV02", propOrder = {
    "rspnId",
    "invstgtnId",
    "rspnSts",
    "schCrit",
    "rtrInd",
    "splmtryData"
})
public class InformationRequestResponseV02 {

    @XmlElement(name = "RspnId", required = true)
    protected String rspnId;
    @XmlElement(name = "InvstgtnId", required = true)
    protected String invstgtnId;
    @XmlElement(name = "RspnSts", required = true)
    @XmlSchemaType(name = "string")
    protected StatusResponse1Code rspnSts;
    @XmlElement(name = "SchCrit", required = true)
    protected SearchCriteria2Choice schCrit;
    @XmlElement(name = "RtrInd", required = true)
    protected List<ReturnIndicator2> rtrInd;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rspnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnId() {
        return rspnId;
    }

    /**
     * Sets the value of the rspnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InformationRequestResponseV02 setRspnId(String value) {
        this.rspnId = value;
        return this;
    }

    /**
     * Gets the value of the invstgtnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvstgtnId() {
        return invstgtnId;
    }

    /**
     * Sets the value of the invstgtnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InformationRequestResponseV02 setInvstgtnId(String value) {
        this.invstgtnId = value;
        return this;
    }

    /**
     * Gets the value of the rspnSts property.
     * 
     * @return
     *     possible object is
     *     {@link StatusResponse1Code }
     *     
     */
    public StatusResponse1Code getRspnSts() {
        return rspnSts;
    }

    /**
     * Sets the value of the rspnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusResponse1Code }
     *     
     */
    public InformationRequestResponseV02 setRspnSts(StatusResponse1Code value) {
        this.rspnSts = value;
        return this;
    }

    /**
     * Gets the value of the schCrit property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteria2Choice }
     *     
     */
    public SearchCriteria2Choice getSchCrit() {
        return schCrit;
    }

    /**
     * Sets the value of the schCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteria2Choice }
     *     
     */
    public InformationRequestResponseV02 setSchCrit(SearchCriteria2Choice value) {
        this.schCrit = value;
        return this;
    }

    /**
     * Gets the value of the rtrInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rtrInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRtrInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnIndicator2 }
     * 
     * 
     * @return
     *     The value of the rtrInd property.
     */
    public List<ReturnIndicator2> getRtrInd() {
        if (rtrInd == null) {
            rtrInd = new ArrayList<>();
        }
        return this.rtrInd;
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
     * Adds a new item to the rtrInd list.
     * @see #getRtrInd()
     * 
     */
    public InformationRequestResponseV02 addRtrInd(ReturnIndicator2 rtrInd) {
        getRtrInd().add(rtrInd);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public InformationRequestResponseV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
