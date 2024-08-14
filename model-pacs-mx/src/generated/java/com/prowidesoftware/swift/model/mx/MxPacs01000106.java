
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
 * Class for pacs.010.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fiDrctDbt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.010.001.06")
public class MxPacs01000106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FIDrctDbt", required = true)
    protected FinancialInstitutionDirectDebitV06 fiDrctDbt;
    public final static transient String BUSINESS_PROCESS = "pacs";
    public final static transient int FUNCTIONALITY = 10;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, CashAccount40 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CreditTransferTransaction66 .class, DirectDebitTransactionInformation33 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionDirectDebitV06 .class, FinancialInstitutionIdentification23 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GroupHeader119 .class, InstructionForCreditorAgent3 .class, LocalInstrument2Choice.class, MxPacs01000106 .class, PaymentIdentification13 .class, PaymentTypeInformation28 .class, PostalAddress27 .class, Priority2Code.class, Priority3Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, Purpose2Choice.class, RemittanceInformation2 .class, ServiceLevel8Choice.class, SettlementDateTimeIndication1 .class, SettlementTimeRequest2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:pacs.010.001.06";

    public MxPacs01000106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPacs01000106(final String xml) {
        this();
        MxPacs01000106 tmp = parse(xml);
        fiDrctDbt = tmp.getFIDrctDbt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPacs01000106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fiDrctDbt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionDirectDebitV06 }
     *     
     */
    public FinancialInstitutionDirectDebitV06 getFIDrctDbt() {
        return fiDrctDbt;
    }

    /**
     * Sets the value of the fiDrctDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionDirectDebitV06 }
     *     
     */
    public MxPacs01000106 setFIDrctDbt(FinancialInstitutionDirectDebitV06 value) {
        this.fiDrctDbt = value;
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
    public static MxPacs01000106 parse(String xml) {
        return ((MxPacs01000106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPacs01000106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxPacs01000106 parse(String xml, MxReadConfiguration conf) {
        return ((MxPacs01000106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPacs01000106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPacs01000106 parse(String xml, MxRead parserImpl) {
        return ((MxPacs01000106) parserImpl.read(MxPacs01000106 .class, xml, _classes));
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
     * Creates an MxPacs01000106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPacs01000106 message
     * @return
     *     a new instance of MxPacs01000106
     */
    public final static MxPacs01000106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxPacs01000106 .class);
    }

}
