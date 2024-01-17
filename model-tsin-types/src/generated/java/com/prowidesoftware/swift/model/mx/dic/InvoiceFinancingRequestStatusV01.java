
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * The InvoiceFinancingRequestStatus message is sent by the First Agent to the Financing Requestor, alternatively through an Intermediary Agent (relay scenario). It is used to inform the Financing Requestor about the positive or negative status of a financing request or a financing cancellation request.
 * Usage
 * The InvoiceFinancingRequestStatus message flows from the First Agent to the Financing Requestor (alternatively through an Intermediary Agent) to provide status information about a request previously sent.
 * Its usage will always be governed by a bilateral agreement between the First Agent and the Financing Requestor.
 * The InvoiceFinancingRequestStatus message can be used two fold:
 * - to provide information about the reception status (eg rejection, acceptance) of a request message. In this case the status message is the result of a technical validation performed by the First Agent on the request message received;
 * - to inform the Financing Requestor about the business status of the financing process initiated. In this case the First Agent can:
 * * communicate that a single financing request has been granted, is pending or has not been granted at all;
 * * inform that a financing cancellation request has been allowed or denied.
 * Note.
 * If the Financing Requestor requests financing for more than one instalment related to the same invoice, the First Agent can decide to finance only some of the instalments. In such case the status message contains details and status of every single instalment (financed, not financed).
 * The message can be used in a direct or in a relay scenario:
 * - In a direct scenario, the message is sent directly by the First Agent to the Financing Requestor;
 * - In a relay scenario, the message is sent first by the First Agent to the Intermediary Agent, who forwards it to the Financing Requestor.
 * The InvoiceFinancingRequestStatus message refers to the original request(s) by means of references and a set of data elements included into the original request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceFinancingRequestStatusV01", propOrder = {
    "stsId",
    "orgnlReqInfAndSts",
    "fincgInfAndSts"
})
public class InvoiceFinancingRequestStatusV01 {

    @XmlElement(name = "StsId", required = true)
    protected MessageIdentification1 stsId;
    @XmlElement(name = "OrgnlReqInfAndSts", required = true)
    protected OriginalRequestInformation1 orgnlReqInfAndSts;
    @XmlElement(name = "FincgInfAndSts")
    protected FinancingInformationAndStatus1 fincgInfAndSts;

    /**
     * Gets the value of the stsId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getStsId() {
        return stsId;
    }

    /**
     * Sets the value of the stsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public InvoiceFinancingRequestStatusV01 setStsId(MessageIdentification1 value) {
        this.stsId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlReqInfAndSts property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalRequestInformation1 }
     *     
     */
    public OriginalRequestInformation1 getOrgnlReqInfAndSts() {
        return orgnlReqInfAndSts;
    }

    /**
     * Sets the value of the orgnlReqInfAndSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalRequestInformation1 }
     *     
     */
    public InvoiceFinancingRequestStatusV01 setOrgnlReqInfAndSts(OriginalRequestInformation1 value) {
        this.orgnlReqInfAndSts = value;
        return this;
    }

    /**
     * Gets the value of the fincgInfAndSts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingInformationAndStatus1 }
     *     
     */
    public FinancingInformationAndStatus1 getFincgInfAndSts() {
        return fincgInfAndSts;
    }

    /**
     * Sets the value of the fincgInfAndSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingInformationAndStatus1 }
     *     
     */
    public InvoiceFinancingRequestStatusV01 setFincgInfAndSts(FinancingInformationAndStatus1 value) {
        this.fincgInfAndSts = value;
        return this;
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

}
