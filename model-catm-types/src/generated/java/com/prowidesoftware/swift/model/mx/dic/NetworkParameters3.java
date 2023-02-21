
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
 * Parameters to communicate with a host.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkParameters3", propOrder = {
    "adr",
    "usrNm",
    "accsCd",
    "svrCert",
    "svrCertIdr"
})
public class NetworkParameters3 {

    @XmlElement(name = "Adr", required = true)
    protected List<NetworkParameters4> adr;
    @XmlElement(name = "UsrNm")
    protected String usrNm;
    @XmlElement(name = "AccsCd")
    protected byte[] accsCd;
    @XmlElement(name = "SvrCert")
    protected List<byte[]> svrCert;
    @XmlElement(name = "SvrCertIdr")
    protected List<byte[]> svrCertIdr;

    /**
     * Gets the value of the adr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkParameters4 }
     * 
     * 
     */
    public List<NetworkParameters4> getAdr() {
        if (adr == null) {
            adr = new ArrayList<NetworkParameters4>();
        }
        return this.adr;
    }

    /**
     * Gets the value of the usrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrNm() {
        return usrNm;
    }

    /**
     * Sets the value of the usrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NetworkParameters3 setUsrNm(String value) {
        this.usrNm = value;
        return this;
    }

    /**
     * Gets the value of the accsCd property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAccsCd() {
        return accsCd;
    }

    /**
     * Sets the value of the accsCd property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public NetworkParameters3 setAccsCd(byte[] value) {
        this.accsCd = value;
        return this;
    }

    /**
     * Gets the value of the svrCert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svrCert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvrCert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getSvrCert() {
        if (svrCert == null) {
            svrCert = new ArrayList<byte[]>();
        }
        return this.svrCert;
    }

    /**
     * Gets the value of the svrCertIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svrCertIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvrCertIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getSvrCertIdr() {
        if (svrCertIdr == null) {
            svrCertIdr = new ArrayList<byte[]>();
        }
        return this.svrCertIdr;
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
     * Adds a new item to the adr list.
     * @see #getAdr()
     * 
     */
    public NetworkParameters3 addAdr(NetworkParameters4 adr) {
        getAdr().add(adr);
        return this;
    }

    /**
     * Adds a new item to the svrCert list.
     * @see #getSvrCert()
     * 
     */
    public NetworkParameters3 addSvrCert(byte[] svrCert) {
        getSvrCert().add(svrCert);
        return this;
    }

    /**
     * Adds a new item to the svrCertIdr list.
     * @see #getSvrCertIdr()
     * 
     */
    public NetworkParameters3 addSvrCertIdr(byte[] svrCertIdr) {
        getSvrCertIdr().add(svrCertIdr);
        return this;
    }

}
