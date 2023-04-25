
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
 * Scope
 * The InvoiceFinancingRequest message is sent by Financing Requestor to the Intermediary Agent or First agent. It is used to request financing of a set of invoices, referenced in the request message itself. If the whole financing request (or a selection of single invoice requests included) is accepted, the amount financed by the First Agent will be credited either to the account specified in the financing request or to another account held by Financing Requestor to First Agent.
 * Usage
 * The InvoiceFinancingRequest message is issued by the Financing Requestor and represents a bulk financing request since it can contain one or more single financing requests, each request related to an invoice.
 * For every invoice it is always possible to identify a supplier and a buyer.
 * The subject playing the role of supplier can be different from the Financing Requestor; in this case the Financing Requestor is allowed to send the request message on behalf of the supplier itself.
 * This caters for example in the scenario of a collection agency initiating all requests on behalf of a large corporate.
 * In instances where an invoice is going to be paid by means of instalments, the Financing Requestor can request financing for one or more instalments related to the invoice payment. In this case, together with the general information related to the invoice, references about instalments to be financed are specified into the request message. The request message must contain information only about the instalments that the Financing Requestor wants to be financed.
 * The InvoiceFinancingRequest message is used to exchange:
 * - One instance of general information related to the invoice financing request;
 * - One instance of information for each single invoice financing request;
 * - Optionally, one instance of information for each single instalment to be financed.
 * The message can be used in a direct or a relay scenario:
 * - In a direct scenario, the message is sent directly to the First Agent. The First Agent is the account servicer of the Financing Requestor;
 * - In a relay scenario, the message is sent to an Intermediary Agent. The Intermediary Agent acts as an access point that will forward the InvoiceFinancingRequest message to the First Agent.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceFinancingRequestV01", propOrder = {
    "reqGrpInf",
    "invcReqInf"
})
public class InvoiceFinancingRequestV01 {

    @XmlElement(name = "ReqGrpInf", required = true)
    protected RequestGroupInformation1 reqGrpInf;
    @XmlElement(name = "InvcReqInf", required = true)
    protected List<InvoiceRequestInformation1> invcReqInf;

    /**
     * Gets the value of the reqGrpInf property.
     * 
     * @return
     *     possible object is
     *     {@link RequestGroupInformation1 }
     *     
     */
    public RequestGroupInformation1 getReqGrpInf() {
        return reqGrpInf;
    }

    /**
     * Sets the value of the reqGrpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestGroupInformation1 }
     *     
     */
    public InvoiceFinancingRequestV01 setReqGrpInf(RequestGroupInformation1 value) {
        this.reqGrpInf = value;
        return this;
    }

    /**
     * Gets the value of the invcReqInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the invcReqInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvcReqInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceRequestInformation1 }
     * 
     * 
     * @return
     *     The value of the invcReqInf property.
     */
    public List<InvoiceRequestInformation1> getInvcReqInf() {
        if (invcReqInf == null) {
            invcReqInf = new ArrayList<>();
        }
        return this.invcReqInf;
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
     * Adds a new item to the invcReqInf list.
     * @see #getInvcReqInf()
     * 
     */
    public InvoiceFinancingRequestV01 addInvcReqInf(InvoiceRequestInformation1 invcReqInf) {
        getInvcReqInf().add(invcReqInf);
        return this;
    }

}
