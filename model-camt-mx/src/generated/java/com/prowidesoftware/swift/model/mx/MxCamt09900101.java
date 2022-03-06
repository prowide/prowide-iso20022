
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.099.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "drctDbtMndtQry"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT1camt.099.001.01")
public class MxCamt09900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DrctDbtMndtQry", required = true)
    protected DirectDebitMandateQueryV01 drctDbtMndtQry;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 99;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AddressType2Code.class, DirectDebitMandateQueryV01 .class, DirectDebitMandateSearchCriteria1 .class, GenericAccountIdentification1 .class, GenericIdentification1 .class, GenericIdentification36 .class, MarketInfrastructureIdentification1Choice.class, MessageHeader9 .class, MxCamt09900101 .class, NameAndAddress5 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PostalAddress1 .class, RequestType4Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemAndCurrency1 .class, SystemIdentification2Choice.class, SystemPartyIdentification8 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT1camt.099.001.01";

    public MxCamt09900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt09900101(final String xml) {
        this();
        MxCamt09900101 tmp = parse(xml);
        drctDbtMndtQry = tmp.getDrctDbtMndtQry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt09900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the drctDbtMndtQry property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitMandateQueryV01 }
     *     
     */
    public DirectDebitMandateQueryV01 getDrctDbtMndtQry() {
        return drctDbtMndtQry;
    }

    /**
     * Sets the value of the drctDbtMndtQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitMandateQueryV01 }
     *     
     */
    public MxCamt09900101 setDrctDbtMndtQry(DirectDebitMandateQueryV01 value) {
        this.drctDbtMndtQry = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCamt09900101 parse(String xml) {
        return ((MxCamt09900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt09900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt09900101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt09900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt09900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt09900101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt09900101) parserImpl.read(MxCamt09900101 .class, xml, _classes));
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
     * Creates an MxCamt09900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt09900101 message
     * @return
     *     a new instance of MxCamt09900101
     */
    public final static MxCamt09900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt09900101 .class);
    }

}
