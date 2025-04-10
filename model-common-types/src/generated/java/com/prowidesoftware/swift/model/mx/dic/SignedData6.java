
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Digital signatures of data from one or several signers.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignedData6", propOrder = {
    "vrsn",
    "dgstAlgo",
    "ncpsltdCntt",
    "cert",
    "sgnr"
})
public class SignedData6 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "DgstAlgo")
    protected List<AlgorithmIdentification21> dgstAlgo;
    @XmlElement(name = "NcpsltdCntt")
    protected EncapsulatedContent3 ncpsltdCntt;
    @XmlElement(name = "Cert")
    protected List<byte[]> cert;
    @XmlElement(name = "Sgnr")
    protected List<Signer5> sgnr;

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
    public SignedData6 setVrsn(BigDecimal value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the dgstAlgo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dgstAlgo property.
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
     * {@link AlgorithmIdentification21 }
     * 
     * 
     * @return
     *     The value of the dgstAlgo property.
     */
    public List<AlgorithmIdentification21> getDgstAlgo() {
        if (dgstAlgo == null) {
            dgstAlgo = new ArrayList<>();
        }
        return this.dgstAlgo;
    }

    /**
     * Gets the value of the ncpsltdCntt property.
     * 
     * @return
     *     possible object is
     *     {@link EncapsulatedContent3 }
     *     
     */
    public EncapsulatedContent3 getNcpsltdCntt() {
        return ncpsltdCntt;
    }

    /**
     * Sets the value of the ncpsltdCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncapsulatedContent3 }
     *     
     */
    public SignedData6 setNcpsltdCntt(EncapsulatedContent3 value) {
        this.ncpsltdCntt = value;
        return this;
    }

    /**
     * Gets the value of the cert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cert property.
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
     * @return
     *     The value of the cert property.
     */
    public List<byte[]> getCert() {
        if (cert == null) {
            cert = new ArrayList<>();
        }
        return this.cert;
    }

    /**
     * Gets the value of the sgnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sgnr property.
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
     * {@link Signer5 }
     * 
     * 
     * @return
     *     The value of the sgnr property.
     */
    public List<Signer5> getSgnr() {
        if (sgnr == null) {
            sgnr = new ArrayList<>();
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
    public SignedData6 addDgstAlgo(AlgorithmIdentification21 dgstAlgo) {
        getDgstAlgo().add(dgstAlgo);
        return this;
    }

    /**
     * Adds a new item to the cert list.
     * @see #getCert()
     * 
     */
    public SignedData6 addCert(byte[] cert) {
        getCert().add(cert);
        return this;
    }

    /**
     * Adds a new item to the sgnr list.
     * @see #getSgnr()
     * 
     */
    public SignedData6 addSgnr(Signer5 sgnr) {
        getSgnr().add(sgnr);
        return this;
    }

}
