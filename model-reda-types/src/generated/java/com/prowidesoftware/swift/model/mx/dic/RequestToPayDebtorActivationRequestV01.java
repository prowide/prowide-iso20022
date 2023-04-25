
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
 * The RequestToPayDebtorActivationRequest message is sent by the debtor RTP (Request To Pay) provider to the creditor RTP provider and optionally from the debtor to its RTP provider and from the creditor RTP provider to the creditor to request the debtor activation of the RTP service with that specific creditor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestToPayDebtorActivationRequestV01", propOrder = {
    "hdr",
    "dbtrActvtn",
    "elctrncInvcData",
    "splmtryData"
})
public class RequestToPayDebtorActivationRequestV01 {

    @XmlElement(name = "Hdr", required = true)
    protected ActivationHeader2 hdr;
    @XmlElement(name = "DbtrActvtn", required = true)
    protected List<DebtorActivation3> dbtrActvtn;
    @XmlElement(name = "ElctrncInvcData", required = true)
    protected ElectronicInvoice1 elctrncInvcData;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationHeader2 }
     *     
     */
    public ActivationHeader2 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationHeader2 }
     *     
     */
    public RequestToPayDebtorActivationRequestV01 setHdr(ActivationHeader2 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrActvtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dbtrActvtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDbtrActvtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DebtorActivation3 }
     * 
     * 
     * @return
     *     The value of the dbtrActvtn property.
     */
    public List<DebtorActivation3> getDbtrActvtn() {
        if (dbtrActvtn == null) {
            dbtrActvtn = new ArrayList<>();
        }
        return this.dbtrActvtn;
    }

    /**
     * Gets the value of the elctrncInvcData property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicInvoice1 }
     *     
     */
    public ElectronicInvoice1 getElctrncInvcData() {
        return elctrncInvcData;
    }

    /**
     * Sets the value of the elctrncInvcData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicInvoice1 }
     *     
     */
    public RequestToPayDebtorActivationRequestV01 setElctrncInvcData(ElectronicInvoice1 value) {
        this.elctrncInvcData = value;
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
     * Adds a new item to the dbtrActvtn list.
     * @see #getDbtrActvtn()
     * 
     */
    public RequestToPayDebtorActivationRequestV01 addDbtrActvtn(DebtorActivation3 dbtrActvtn) {
        getDbtrActvtn().add(dbtrActvtn);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public RequestToPayDebtorActivationRequestV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
