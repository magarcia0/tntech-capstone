import React from 'react';
import styles from './DataTable.module.css';

const DataTable = ({ data }) => {

  return (
    <div className={styles.mainContainer}>
      <h1 className={styles.pageHeader}>Fancy Header</h1>
      <div className={styles.tableContainer}>
        <table className={styles.table}>
          <thead>
            <tr className={styles.header}>
              <th className={styles.cellHeader}>ID</th>
              <th className={styles.cellHeader}>Name</th>
              <th className={styles.cellHeader}>Occupation</th>
              <th className={styles.cellHeader}>Hobby</th>
            </tr>
          </thead>
          <tbody>
            {data.map((item) => (
              <tr key={item.id} className={styles.row}>
                <td className={styles.cell}>{item.id}</td>
                <td className={styles.cell}>{item.name}</td>
                <td className={styles.cell}>{item.occupation}</td>
                <td className={styles.cell}>{item.hobby}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );

};

export default DataTable;
