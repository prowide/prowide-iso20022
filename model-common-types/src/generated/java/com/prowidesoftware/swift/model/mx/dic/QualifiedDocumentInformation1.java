
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies an identification of a document assigned by and relative to the issuing party (of the identification).
 * Optionally, the component can contain a copy of the identified document and a URI/URL (Universal Resource Information/Location) facilitating retrieval of the document.
 * The component may also contain a cryptographic hash of the referenced document.
 * Financial items are identified by three parts:
 * (1) the creator of the document,
 * (2) an identification of a dossier, and
 * (3) an identification of a financial item.
 * The two latter identifiers are independent permitting to identify the same item in several lists.
 * The element identification is of schema type ID, it can be referenced by IDREF typed elements (composite=false).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifiedDocumentInformation1", propOrder = {
    "id",
    "issr",
    "itmListIdr",
    "itmIdr",
    "dt",
    "vrsn",
    "elctrncOrgnl",
    "dgst",
    "docTp",
    "url",
    "attchdFile"
})
public class QualifiedDocumentInformation1 {

    @XmlElement(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlElement(name = "Issr")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object issr;
    @XmlElement(name = "ItmListIdr")
    protected String itmListIdr;
    @XmlElement(name = "ItmIdr")
    protected String itmIdr;
    @XmlElement(name = "Dt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "Vrsn")
    protected String vrsn;
    @XmlElement(name = "ElctrncOrgnl")
    protected boolean elctrncOrgnl;
    @XmlElement(name = "Dgst")
    protected List<AlgorithmAndDigest1> dgst;
    @XmlElement(name = "DocTp")
    protected String docTp;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "AttchdFile")
    protected List<BinaryFile1> attchdFile;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public QualifiedDocumentInformation1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public QualifiedDocumentInformation1 setIssr(Object value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the itmListIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmListIdr() {
        return itmListIdr;
    }

    /**
     * Sets the value of the itmListIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public QualifiedDocumentInformation1 setItmListIdr(String value) {
        this.itmListIdr = value;
        return this;
    }

    /**
     * Gets the value of the itmIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmIdr() {
        return itmIdr;
    }

    /**
     * Sets the value of the itmIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public QualifiedDocumentInformation1 setItmIdr(String value) {
        this.itmIdr = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public QualifiedDocumentInformation1 setDt(XMLGregorianCalendar value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public QualifiedDocumentInformation1 setVrsn(String value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the elctrncOrgnl property.
     * 
     */
    public boolean isElctrncOrgnl() {
        return elctrncOrgnl;
    }

    /**
     * Sets the value of the elctrncOrgnl property.
     * 
     */
    public QualifiedDocumentInformation1 setElctrncOrgnl(boolean value) {
        this.elctrncOrgnl = value;
        return this;
    }

    /**
     * Gets the value of the dgst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dgst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlgorithmAndDigest1 }
     * 
     * 
     */
    public List<AlgorithmAndDigest1> getDgst() {
        if (dgst == null) {
            dgst = new ArrayList<AlgorithmAndDigest1>();
        }
        return this.dgst;
    }

    /**
     * Gets the value of the docTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTp() {
        return docTp;
    }

    /**
     * Sets the value of the docTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public QualifiedDocumentInformation1 setDocTp(String value) {
        this.docTp = value;
        return this;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public QualifiedDocumentInformation1 setURL(String value) {
        this.url = value;
        return this;
    }

    /**
     * Gets the value of the attchdFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attchdFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchdFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BinaryFile1 }
     * 
     * 
     */
    public List<BinaryFile1> getAttchdFile() {
        if (attchdFile == null) {
            attchdFile = new ArrayList<BinaryFile1>();
        }
        return this.attchdFile;
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
     * Adds a new item to the dgst list.
     * @see #getDgst()
     * 
     */
    public QualifiedDocumentInformation1 addDgst(AlgorithmAndDigest1 dgst) {
        getDgst().add(dgst);
        return this;
    }

    /**
     * Adds a new item to the attchdFile list.
     * @see #getAttchdFile()
     * 
     */
    public QualifiedDocumentInformation1 addAttchdFile(BinaryFile1 attchdFile) {
        getAttchdFile().add(attchdFile);
        return this;
    }

}
