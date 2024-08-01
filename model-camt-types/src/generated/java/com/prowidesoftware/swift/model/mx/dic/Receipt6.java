
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
 * Provides details on the request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Receipt6", propOrder = {
    "orgnlMsgId",
    "orgnlPmtId",
    "reqHdlg"
})
public class Receipt6 {

    @XmlElement(name = "OrgnlMsgId", required = true)
    protected OriginalMessageAndIssuer1 orgnlMsgId;
    @XmlElement(name = "OrgnlPmtId")
    protected PaymentIdentification8Choice orgnlPmtId;
    @XmlElement(name = "ReqHdlg")
    protected List<RequestHandling3> reqHdlg;

    /**
     * Gets the value of the orgnlMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalMessageAndIssuer1 }
     *     
     */
    public OriginalMessageAndIssuer1 getOrgnlMsgId() {
        return orgnlMsgId;
    }

    /**
     * Sets the value of the orgnlMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalMessageAndIssuer1 }
     *     
     */
    public Receipt6 setOrgnlMsgId(OriginalMessageAndIssuer1 value) {
        this.orgnlMsgId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlPmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification8Choice }
     *     
     */
    public PaymentIdentification8Choice getOrgnlPmtId() {
        return orgnlPmtId;
    }

    /**
     * Sets the value of the orgnlPmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification8Choice }
     *     
     */
    public Receipt6 setOrgnlPmtId(PaymentIdentification8Choice value) {
        this.orgnlPmtId = value;
        return this;
    }

    /**
     * Gets the value of the reqHdlg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the reqHdlg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqHdlg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestHandling3 }
     * 
     * 
     * @return
     *     The value of the reqHdlg property.
     */
    public List<RequestHandling3> getReqHdlg() {
        if (reqHdlg == null) {
            reqHdlg = new ArrayList<>();
        }
        return this.reqHdlg;
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
     * Adds a new item to the reqHdlg list.
     * @see #getReqHdlg()
     * 
     */
    public Receipt6 addReqHdlg(RequestHandling3 reqHdlg) {
        getReqHdlg().add(reqHdlg);
        return this;
    }

}
