
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for reda.041.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ptyActvtyAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.041.001.01")
public class MxReda04100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PtyActvtyAdvc", required = true)
    protected PartyActivityAdviceV01 ptyActvtyAdvc;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 41;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AddressType3Choice.class, CodeOrProprietary1Choice.class, Contact5 .class, GenericIdentification13 .class, GenericIdentification30 .class, GenericIdentification36 .class, LockStatus1Code.class, MarketSpecificAttribute1 .class, MessageHeader1 .class, MxReda04100101 .class, NameAndAddress5 .class, NamePrefix2Code.class, OtherContact1 .class, PartyActivityAdviceV01 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PartyLockStatus1 .class, PartyName4 .class, PartyReferenceDataChange2 .class, PartyStatement2 .class, PostalAddress1 .class, PostalAddress25 .class, PreferredContactMethod1Code.class, ResidenceType1Code.class, Restriction1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification8 .class, SystemPartyType1Choice.class, TechnicalIdentification2Choice.class, UpdateLogAddress1 .class, UpdateLogContact1 .class, UpdateLogDate1 .class, UpdateLogMarketSpecificAttribute1 .class, UpdateLogPartyLockStatus1 .class, UpdateLogPartyName1 .class, UpdateLogPartyRecord1Choice.class, UpdateLogProprietary1 .class, UpdateLogResidenceType1 .class, UpdateLogRestriction1 .class, UpdateLogSystemPartyType1 .class, UpdateLogTechnicalAddress1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.041.001.01";

    public MxReda04100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda04100101(final String xml) {
        this();
        MxReda04100101 tmp = parse(xml);
        ptyActvtyAdvc = tmp.getPtyActvtyAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda04100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ptyActvtyAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link PartyActivityAdviceV01 }
     *     
     */
    public PartyActivityAdviceV01 getPtyActvtyAdvc() {
        return ptyActvtyAdvc;
    }

    /**
     * Sets the value of the ptyActvtyAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyActivityAdviceV01 }
     *     
     */
    public MxReda04100101 setPtyActvtyAdvc(PartyActivityAdviceV01 value) {
        this.ptyActvtyAdvc = value;
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
    public static MxReda04100101 parse(String xml) {
        return ((MxReda04100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda04100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda04100101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda04100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda04100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda04100101 parse(String xml, MxRead parserImpl) {
        return ((MxReda04100101) parserImpl.read(MxReda04100101 .class, xml, _classes));
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
     * Creates an MxReda04100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda04100101 message
     * @return
     *     a new instance of MxReda04100101
     */
    public final static MxReda04100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda04100101 .class);
    }

}
