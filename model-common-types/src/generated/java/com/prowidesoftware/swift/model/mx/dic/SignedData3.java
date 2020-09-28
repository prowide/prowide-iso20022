
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Digital signature of data, with an asymmetric key.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignedData3", propOrder = {
    "vrsn",
    "dgstAlgo",
    "ncpsltdCntt",
    "cert",
    "sgnr"
})
public class SignedData3 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "DgstAlgo", required = true)
    protected List<AlgorithmIdentification5> dgstAlgo;
    @XmlElement(name = "NcpsltdCntt", required = true)
    protected EncapsulatedContent2 ncpsltdCntt;
    @XmlElement(name = "Cert")
    protected List<byte[]> cert;
    @XmlElement(name = "Sgnr", required = true)
    protected List<Signer2> sgnr;

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SignedData3 setVrsn(BigDecimal value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the dgstAlgo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dgstAlgo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgstAlgo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlgorithmIdentification5 }
     * 
     * 
     */
    public List<AlgorithmIdentification5> getDgstAlgo() {
        if (dgstAlgo == null) {
            dgstAlgo = new ArrayList<AlgorithmIdentification5>();
        }
        return this.dgstAlgo;
    }

    /**
     * Gets the value of the ncpsltdCntt property.
     * 
     * @return
     *     possible object is
     *     {@link EncapsulatedContent2 }
     *     
     */
    public EncapsulatedContent2 getNcpsltdCntt() {
        return ncpsltdCntt;
    }

    /**
     * Sets the value of the ncpsltdCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncapsulatedContent2 }
     *     
     */
    public SignedData3 setNcpsltdCntt(EncapsulatedContent2 value) {
        this.ncpsltdCntt = value;
        return this;
    }

    /**
     * Gets the value of the cert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getCert() {
        if (cert == null) {
            cert = new ArrayList<byte[]>();
        }
        return this.cert;
    }

    /**
     * Gets the value of the sgnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sgnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSgnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Signer2 }
     * 
     * 
     */
    public List<Signer2> getSgnr() {
        if (sgnr == null) {
            sgnr = new ArrayList<Signer2>();
        }
        return this.sgnr;
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
     * Adds a new item to the dgstAlgo list.
     * @see #getDgstAlgo()
     * 
     */
    public SignedData3 addDgstAlgo(AlgorithmIdentification5 dgstAlgo) {
        getDgstAlgo().add(dgstAlgo);
        return this;
    }

    /**
     * Adds a new item to the cert list.
     * @see #getCert()
     * 
     */
    public SignedData3 addCert(byte[] cert) {
        getCert().add(cert);
        return this;
    }

    /**
     * Adds a new item to the sgnr list.
     * @see #getSgnr()
     * 
     */
    public SignedData3 addSgnr(Signer2 sgnr) {
        getSgnr().add(sgnr);
        return this;
    }

}
