
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
 * The AcquirerToAcceptorBatchFileExchange message is sent by an acquirer (or its agent) to the acceptor (or its agent), to send a batch of response.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquirerToAcceptorBatchFileExchangeV01", propOrder = {
    "hdr",
    "bodyElmt",
    "rspn",
    "sctyTrlr"
})
public class AcquirerToAcceptorBatchFileExchangeV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header56 hdr;
    @XmlElement(name = "BodyElmt")
    protected List<AcquirerToAcceptorFileBody1> bodyElmt;
    @XmlElement(name = "Rspn", required = true)
    protected ResponseType11 rspn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType38 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header56 }
     *     
     */
    public Header56 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header56 }
     *     
     */
    public AcquirerToAcceptorBatchFileExchangeV01 setHdr(Header56 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the bodyElmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bodyElmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBodyElmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcquirerToAcceptorFileBody1 }
     * 
     * 
     */
    public List<AcquirerToAcceptorFileBody1> getBodyElmt() {
        if (bodyElmt == null) {
            bodyElmt = new ArrayList<AcquirerToAcceptorFileBody1>();
        }
        return this.bodyElmt;
    }

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType11 }
     *     
     */
    public ResponseType11 getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType11 }
     *     
     */
    public AcquirerToAcceptorBatchFileExchangeV01 setRspn(ResponseType11 value) {
        this.rspn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType38 }
     *     
     */
    public ContentInformationType38 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType38 }
     *     
     */
    public AcquirerToAcceptorBatchFileExchangeV01 setSctyTrlr(ContentInformationType38 value) {
        this.sctyTrlr = value;
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

    /**
     * Adds a new item to the bodyElmt list.
     * @see #getBodyElmt()
     * 
     */
    public AcquirerToAcceptorBatchFileExchangeV01 addBodyElmt(AcquirerToAcceptorFileBody1 bodyElmt) {
        getBodyElmt().add(bodyElmt);
        return this;
    }

}
