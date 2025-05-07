
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
 * Class for reda.043.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ptyAudtTrlRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.043.001.02")
public class MxReda04300102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PtyAudtTrlRpt", required = true)
    protected PartyAuditTrailReportV02 ptyAudtTrlRpt;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 43;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AddressType3Choice.class, CodeOrProprietary1Choice.class, Contact14 .class, DatePeriod2 .class, DatePeriod3Choice.class, ErrorHandling3Choice.class, ErrorHandling5 .class, GenericIdentification13 .class, GenericIdentification30 .class, GenericIdentification36 .class, LockStatus1Code.class, MarketSpecificAttribute1 .class, MessageHeader12 .class, MxReda04300102 .class, NameAndAddress5 .class, NamePrefix2Code.class, OriginalBusinessInstruction1 .class, OtherContact1 .class, PartyAuditTrail2 .class, PartyAuditTrailOrError3Choice.class, PartyAuditTrailOrError4Choice.class, PartyAuditTrailReport4 .class, PartyAuditTrailReportV02 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PartyLockStatus1 .class, PartyName4 .class, PostalAddress1 .class, PostalAddress28 .class, PreferredContactMethod2Code.class, ResidenceType1Code.class, Restriction1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification8 .class, SystemPartyType1Choice.class, TechnicalIdentification2Choice.class, UpdateLogAddress2 .class, UpdateLogContact2 .class, UpdateLogDate1 .class, UpdateLogMarketSpecificAttribute1 .class, UpdateLogPartyLockStatus1 .class, UpdateLogPartyName1 .class, UpdateLogPartyRecord2Choice.class, UpdateLogProprietary1 .class, UpdateLogResidenceType1 .class, UpdateLogRestriction1 .class, UpdateLogSystemPartyType1 .class, UpdateLogTechnicalAddress1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.043.001.02";

    public MxReda04300102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda04300102(final String xml) {
        this();
        MxReda04300102 tmp = parse(xml);
        ptyAudtTrlRpt = tmp.getPtyAudtTrlRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda04300102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ptyAudtTrlRpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAuditTrailReportV02 }
     *     
     */
    public PartyAuditTrailReportV02 getPtyAudtTrlRpt() {
        return ptyAudtTrlRpt;
    }

    /**
     * Sets the value of the ptyAudtTrlRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAuditTrailReportV02 }
     *     
     */
    public MxReda04300102 setPtyAudtTrlRpt(PartyAuditTrailReportV02 value) {
        this.ptyAudtTrlRpt = value;
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
    public static MxReda04300102 parse(String xml) {
        return ((MxReda04300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda04300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda04300102 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda04300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda04300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda04300102 parse(String xml, MxRead parserImpl) {
        return ((MxReda04300102) parserImpl.read(MxReda04300102 .class, xml, _classes));
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
     * Creates an MxReda04300102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda04300102 message
     * @return
     *     a new instance of MxReda04300102
     */
    public final static MxReda04300102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda04300102 .class);
    }

}
