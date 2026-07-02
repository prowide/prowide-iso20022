
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
 * Class for auth.027.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ccyCtrlStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.027.001.02")
public class MxAuth02700102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CcyCtrlStsAdvc", required = true)
    protected CurrencyControlStatusAdviceV02 ccyCtrlStsAdvc;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 27;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AddressType3Choice.class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact4 .class, CurrencyControlGroupStatus2 .class, CurrencyControlHeader6 .class, CurrencyControlPackageStatus2 .class, CurrencyControlRecordStatus2 .class, CurrencyControlStatusAdviceV02 .class, DateAndPlaceOfBirth1 .class, DocumentIdentification28 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GenericValidationRuleIdentification1 .class, LegalOrganisation2 .class, MxAuth02700102 .class, NamePrefix2Code.class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalMessage5 .class, OtherContact1 .class, Party38Choice.class, Party40Choice.class, PartyIdentification135 .class, Period2 .class, Period4Choice.class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, PreferredContactMethod1Code.class, StatisticalReportingStatus1Code.class, StatusReason6Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxExemptionReasonFormat1Choice.class, TaxParty4 .class, TradeParty5 .class, ValidationRuleSchemeName1Choice.class, ValidationStatusReason2 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.027.001.02";

    public MxAuth02700102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth02700102(final String xml) {
        this();
        MxAuth02700102 tmp = parse(xml);
        ccyCtrlStsAdvc = tmp.getCcyCtrlStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth02700102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ccyCtrlStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyControlStatusAdviceV02 }
     *     
     */
    public CurrencyControlStatusAdviceV02 getCcyCtrlStsAdvc() {
        return ccyCtrlStsAdvc;
    }

    /**
     * Sets the value of the ccyCtrlStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyControlStatusAdviceV02 }
     *     
     */
    public MxAuth02700102 setCcyCtrlStsAdvc(CurrencyControlStatusAdviceV02 value) {
        this.ccyCtrlStsAdvc = value;
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
    public static MxAuth02700102 parse(String xml) {
        return ((MxAuth02700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth02700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth02700102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth02700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth02700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth02700102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth02700102) parserImpl.read(MxAuth02700102 .class, xml, _classes));
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
     * Creates an MxAuth02700102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth02700102 message
     * @return
     *     a new instance of MxAuth02700102
     */
    public final static MxAuth02700102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth02700102 .class);
    }

}
