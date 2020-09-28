
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for colr.012.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "collSbstitnConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.012.001.01")
public class MxColr01200101
    extends AbstractMX
{

    @XmlElement(name = "CollSbstitnConf", required = true)
    protected CollateralSubstitutionConfirmationV01 collSbstitnConf;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 12;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Agreement2 .class, AgreementFramework1Choice.class, AgreementFramework1Code.class, CollateralConfirmation1 .class, CollateralSubstitutionConfirmation1Code.class, CollateralSubstitutionConfirmationV01 .class, CopyDuplicate1Code.class, DateAndDateTimeChoice.class, GenericIdentification29 .class, GenericIdentification30 .class, MxColr01200101 .class, NameAndAddress6 .class, PartyIdentification33Choice.class, PostalAddress2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionAndDocumentIdentification3 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.012.001.01";

    public MxColr01200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr01200101(final String xml) {
        this();
        MxColr01200101 tmp = parse(xml);
        collSbstitnConf = tmp.getCollSbstitnConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr01200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the collSbstitnConf property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralSubstitutionConfirmationV01 }
     *     
     */
    public CollateralSubstitutionConfirmationV01 getCollSbstitnConf() {
        return collSbstitnConf;
    }

    /**
     * Sets the value of the collSbstitnConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralSubstitutionConfirmationV01 }
     *     
     */
    public MxColr01200101 setCollSbstitnConf(CollateralSubstitutionConfirmationV01 value) {
        this.collSbstitnConf = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxColr01200101 parse(String xml) {
        return ((MxColr01200101) MxReadImpl.parse(MxColr01200101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr01200101 parse(String xml, MxRead parserImpl) {
        return ((MxColr01200101) parserImpl.read(MxColr01200101 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxColr01200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr01200101 message
     * @return
     *     a new instance of MxColr01200101
     */
    public final static MxColr01200101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxColr01200101 .class);
    }

}
